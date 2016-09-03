package ehealth.model.bl;

import ehealth.controller_db.ws.Goal;
import ehealth.controller_db.ws.HealthMeasureHistory;
import ehealth.controller_db.ws.HealthProfile;
import ehealth.controller_db.ws.Person;
import ehealth.controller_storage.ws.ServiceStorage;
import ehealth.controller_storage.ws.StorageService;

import java.util.List;

/**
 * Created by Navid on 8/30/2016.
 */
public class GoalAchieve {
    private StorageService storageService = new StorageService();
    private ServiceStorage serviceStorage = storageService.getServiceStorageImplPort();
    private List<Goal> goalList;
    private List<HealthProfile> healthProfileList;

    public String compare(Person person, String measureType)
    {
        goalList = serviceStorage.readLatestGoalList(person.getIdPerson());
        healthProfileList = serviceStorage.readPerson(person.getIdPerson()).getCurrentHealth().getMeasure();

        try
        {
            if ("weight".equals(measureType) || "height".equals(measureType))
            {
                return compareWeightHeight(person, measureType);
            } else if ("steps".equals(measureType) || "sleep".equals(measureType) || "water".equals(measureType))
            {
                return compareSum(person, measureType);
            } else if ("heart rate".equals(measureType))
            {
                return compareAvg(person, measureType);
            }
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    public String compareWeightHeight(Person person, String measureType)
    {
        for(Goal goal:goalList)
        {
            for(HealthProfile healthProfile: healthProfileList)
            {
                //if goal measure "x" equals profile "x" and x should be weight or height
                if(healthProfile.getMeasureType().equals(goal.getMeasureDefinition().getMeasureType())
                        && (healthProfile.getMeasureType().equals("weight") || healthProfile.getMeasureType().equals("height"))
                        && healthProfile.getMeasureType().equals(measureType))
                {
                    //if string has + in it
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        String[] values = goal.getGoalValue().split("[+]");
                        Double gained_value = Double.parseDouble(healthProfile.getMeasureValue()) - Double.parseDouble(values[0]);
                        if(gained_value >= Double.parseDouble(values[1]))
                        {
                            //GOAL is reached
                            return "You have reached your "+healthProfile.getMeasureType()+" goal. You have "
                                    + healthProfile.getMeasureValueType().split(":")[1] + " " +
                                    gained_value +healthProfile.getMeasureValueType().split(":")[0]+".";
                        }else
                        {
                            Double diff = Double.parseDouble(values[1]) - gained_value;

                            return "You have not reached your "+healthProfile.getMeasureType()+" goal. " +
                                    "Your "+healthProfile.getMeasureType()+" level should be increased "+ diff
                                    + healthProfile.getMeasureValueType().split(":")[0];
                        }
                    }else if (goal.getGoalValue().indexOf("-") != -1)
                    {
                        String[] values = goal.getGoalValue().split("-");
                        Double lost_value = Double.parseDouble(values[0]) - Double.parseDouble(healthProfile.getMeasureValue()) ;
                        if(Double.parseDouble(values[1]) <= lost_value)
                        {
                            //GOAL is reached
                            return "You have reached your "+healthProfile.getMeasureType()+" goal. You have "
                                    + healthProfile.getMeasureValueType().split(":")[2] + " " +
                                    lost_value + healthProfile.getMeasureValueType().split(":")[0]+".";
                        }
                        else
                        {
                            Double diff = Double.parseDouble(values[1]) - lost_value;
                            return "You have not reached your "+healthProfile.getMeasureType()+" goal. " +
                                    "Your "+healthProfile.getMeasureType()+" level should be decreased "+ diff
                                    + healthProfile.getMeasureValueType().split(":")[0];
                        }
                    }
                }
            }
        }

        //Goal not reached
        return "Both Goal & Measure should be set for "+ measureType+".";
    }

    public String compareSum(Person person, String measureType)
    {
        for(Goal goal:goalList)
        {
            for(HealthProfile healthProfile: healthProfileList)
            {
                //if goal measure "x" equals profile "x" and x should be steps or water or sleep
                if(healthProfile.getMeasureType().equals(goal.getMeasureDefinition().getMeasureType())
                        && (healthProfile.getMeasureType().equals("water")
                        || healthProfile.getMeasureType().equals("sleep")
                        || healthProfile.getMeasureType().equals("steps"))
                        && healthProfile.getMeasureType().equals(measureType))
                {
                    List<HealthMeasureHistory> healthMeasureHistoryList =
                            serviceStorage.readPersonHistory(person.getIdPerson(), healthProfile.getMeasureType());

                    double sum_of_values = 0;
                    //sum of the values from creation of Goal from measure history up to now
                    for(HealthMeasureHistory healthMeasureHistory: healthMeasureHistoryList)
                    {
                        //measure history is after goal creation time and date
                        if(healthMeasureHistory.getDateRegistered().compare(goal.getDateRegistered()) >= 0)
                        {
                            sum_of_values += Double.parseDouble(healthMeasureHistory.getMeasureValue());
                        }
                    }

                    //if string has + in it
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        String[] values = goal.getGoalValue().split("[+]");
                        if(Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values >=
                                (Double.parseDouble(values[0])+Double.parseDouble(values[1])))
                        {
                            //GOAL is reached
                            return "You have reached your "+healthProfile.getMeasureType()+" goal. You have "
                                    + healthProfile.getMeasureValueType().split(":")[1] + " " +
                                    (Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)
                                    +healthProfile.getMeasureValueType().split(":")[0]+".";
                        }else
                        {
                            double diff = (Double.parseDouble(values[0])+Double.parseDouble(values[1])) -
                                    Double.parseDouble(healthProfile.getMeasureValue()) + sum_of_values;
                            return "Oops!. You need " +diff+" more "+healthProfile.getMeasureValueType().split(":")[0]
                                    +" to reach your " +healthProfile.getMeasureType()+" goal.";
                        }

                    }
                }
            }
        }

        return "Both Goal & Measure should be set for "+ measureType+".";
    }

    public String compareAvg(Person person, String measureType)
    {
        for(Goal goal:goalList)
        {
            for(HealthProfile healthProfile: healthProfileList)
            {
                //if goal measure "x" equals profile "x" and x should be steps or water or sleep
                if(healthProfile.getMeasureType().equals(goal.getMeasureDefinition().getMeasureType())
                        && healthProfile.getMeasureType().equals("heart rate")
                        && healthProfile.getMeasureType().equals(measureType))
                {
                    List<HealthMeasureHistory> healthMeasureHistoryList =
                            serviceStorage.readPersonHistory(person.getIdPerson(), healthProfile.getMeasureType());

                    double sum_of_values = 0;
                    double count = 1; //starting from 1 because we also have healthprofile
                    //sum of the values from creation of Goal from measure history up to now
                    for(HealthMeasureHistory healthMeasureHistory: healthMeasureHistoryList)
                    {
                        count = count + 1;
                        //measure history is after goal creation time and date
                        if(healthMeasureHistory.getDateRegistered().compare(goal.getDateRegistered()) >= 0)
                        {
                            sum_of_values += Double.parseDouble(healthMeasureHistory.getMeasureValue());
                        }
                    }
                    //if string has + in it
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        String[] values = goal.getGoalValue().split("[+]");
                        //FIVE is +/- threshold
                        if(((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count)+5 >=
                                Double.parseDouble(values[0])+Double.parseDouble(values[1])
                                &&
                                ((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count)-5 <=
                                        Double.parseDouble(values[0])+Double.parseDouble(values[1]))
                        {
                            double average_of_measure =
                                    (Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count;
                            //GOAL is reached
                            return "You have reached your "+healthProfile.getMeasureType()+" goal. You have "
                                    + healthProfile.getMeasureValueType().split(":")[1] + " it to the average of "
                                    +average_of_measure+healthProfile.getMeasureValueType().split(":")[0]+".";
                        }else
                        {
                            return "Oh! You need to bring your average of "+healthProfile.getMeasureType()+
                                    " measure close to "+(Double.parseDouble(values[0])+Double.parseDouble(values[1]))+
                                    healthProfile.getMeasureValueType().split(":")[0]+
                                    " instead of "+
                                    ((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count) +" "+
                                    healthProfile.getMeasureValueType().split(":")[0]+".";
                        }
                    }else if(goal.getGoalValue().indexOf("-") != -1)
                    {
                        String[] values = goal.getGoalValue().split("-");
                        //FIVE is +/- threshold
                        if(((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count)+5 >=
                                Double.parseDouble(values[0])-Double.parseDouble(values[1])
                                &&
                                ((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count)-5 <=
                                        Double.parseDouble(values[0])-Double.parseDouble(values[1]))
                        {

                            double average_of_measure = (Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count;
                            //GOAL is reached
                            return "You have reached your "+healthProfile.getMeasureType()+" goal. You have "
                                    + healthProfile.getMeasureValueType().split(":")[2] + " it to the average of "
                                    +average_of_measure+healthProfile.getMeasureValueType().split(":")[0]+".";
                        }else
                        {
                            return "Oh! You need to bring your average of "+healthProfile.getMeasureType()+
                                    " measure close to "+(Double.parseDouble(values[0])-Double.parseDouble(values[1]))+
                                    healthProfile.getMeasureValueType().split(":")[0]+
                                    " instead of "+
                                    ((Double.parseDouble(healthProfile.getMeasureValue())+sum_of_values)/count) +" "+
                                    healthProfile.getMeasureValueType().split(":")[0]+".";
                        }
                    }
                }
            }
        }

        return "Both Goal & Measure should be set for "+ measureType+".";
    }
}
