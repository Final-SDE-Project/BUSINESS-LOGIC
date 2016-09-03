package ehealth.model.bl;

import ehealth.controller_db.ws.*;
import ehealth.controller_storage.ws.ServiceStorage;
import ehealth.controller_storage.ws.StorageService;
import org.json.JSONObject;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

/**
 * Created by Navid on 8/30/2016.
 */
public class Reminder {
    private StorageService storageService = new StorageService();
    private ServiceStorage serviceStorage = storageService.getServiceStorageImplPort();

    //Method that shows you your ideal weight range based on your BMI and sets a Goal to
    //achieve that weight
    public String idealWeightReminder_SetGoal(Person person)
    {
        try
        {
            List<HealthProfile> healthProfileList = serviceStorage.readPerson(person.getIdPerson()).getCurrentHealth().getMeasure();
            double weight = 0;
            double height = 0;
            for(HealthProfile healthProfile: healthProfileList)
            {
                if(healthProfile.getMeasureType().equals("weight"))
                {
                    weight = Double.parseDouble(healthProfile.getMeasureValue());
                }
                if(healthProfile.getMeasureType().equals("height"))
                {
                    height = Double.parseDouble(healthProfile.getMeasureValue());
                }
            }
            if(weight!=0 && height!=0)
            {
                JSONObject obj = new JSONObject(serviceStorage.readBmi(weight,height));
                String tmp = obj.getString("ideal_weight"); //"65.1kg to 79.5kg"
                System.out.println("Your ideal Weight should be between "+tmp);
                String status = obj.getJSONObject("bmi").getString("status");
                String risk = obj.getJSONObject("bmi").getString("risk");

                String[] val = tmp.split(" to "); //65.1kg, 79.5kg
                //System.out.println(val[0].split("kg")[0]); //65.1
                //System.out.println(val[1].split("kg")[0]); //79.5
                if(weight < Double.parseDouble(val[0].split("kg")[0]))
                {
                    //save automatic goal to achieve ideal weight
                    Goal goal = new Goal();
                    goal.setGoalValue(weight + "+" + (Double.parseDouble(val[0].split("kg")[0]) - weight));
                    goal.setMeasureDefinition(serviceStorage.readMeasureType("weight"));
                    goal.setPerson(person);
                    serviceStorage.saveGoal(goal);

                    return "You should gain "+(Double.parseDouble(val[0].split("kg")[0])-weight)+
                            " kilograms to obtain a normal weight based on your BMI of "+
                            obj.getJSONObject("bmi").getString("value")+". "+
                            "Your health status is "+status+" and you have "+risk.toLowerCase()+".";
                }else if(Double.parseDouble(val[0].split("kg")[0]) <= weight
                        && weight <= Double.parseDouble(val[1].split("kg")[0]))
                {
                    return "You have ideal weight of "+weight+" kilograms based on your BMI of "+
                            obj.getJSONObject("bmi").getString("value")+". "+
                            "Your health status is "+status+" and you have "+risk.toLowerCase()+".";
                }else if(Double.parseDouble(val[1].split("kg")[0]) < weight)
                {
                    //save automatic goal to achieve ideal weight
                    Goal goal = new Goal();
                    goal.setGoalValue(weight + "-" + (weight-Double.parseDouble(val[1].split("kg")[0])));
                    goal.setMeasureDefinition(serviceStorage.readMeasureType("weight"));
                    goal.setPerson(person);
                    serviceStorage.saveGoal(goal);

                    return "You should lose "+(weight-Double.parseDouble(val[1].split("kg")[0]))+
                            " kilograms to obtain a normal weight based on your BMI of "+
                            obj.getJSONObject("bmi").getString("value")+". "+
                            "Your health status is "+status+" and you have "+risk.toLowerCase()+".";
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "You should enter your Weight and Height measures first.";
    }

    //Method that finds the biggest change in weight during the last 90 days
    public String weightChangeReminder(Person person)
    {
        try
        {
            List<HealthProfile> healthProfileList = serviceStorage.readPerson(person.getIdPerson()).getCurrentHealth().getMeasure();
            for(HealthProfile healthProfile: healthProfileList)
            {
                //This feature is for weight
                if((healthProfile.getMeasureType().equals("weight")))
                {
                    //Define date of now
                    Calendar now = Calendar.getInstance();
                    GregorianCalendar beforeDate = new GregorianCalendar();
                    beforeDate.setTime(now.getTime());
                    XMLGregorianCalendar nowDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(beforeDate);

                    //Define date 3 months before now (if days equals = 90)
                    now.add(Calendar.DATE, -1*90);
                    GregorianCalendar afterDate = new GregorianCalendar();
                    afterDate.setTime(now.getTime());//this is 3 months ago
                    XMLGregorianCalendar afterDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(afterDate);

                    //Get list of History measures of 'WEIGHT' in a season period before now (if days equals = 90)
                    List<HealthMeasureHistory> healthMeasureHistoryList =
                            serviceStorage.readMeasureHistoriesByDate(person.getIdPerson(), healthProfile.getMeasureType(),
                                    nowDateXML,afterDateXML);


                    double diff_value = 0;
                    boolean value_gain_loss = false;
                    Date big_diff_date = new Date();
                    for(HealthMeasureHistory healthMeasureHistory:healthMeasureHistoryList)
                    {
                        if(Math.abs(Double.parseDouble(healthProfile.getMeasureValue())
                                - Double.parseDouble(healthMeasureHistory.getMeasureValue())) > diff_value)
                        {
                            diff_value = Math.abs(Double.parseDouble(healthProfile.getMeasureValue())
                                    - Double.parseDouble(healthMeasureHistory.getMeasureValue()));
                            big_diff_date = healthMeasureHistory.getDateRegistered().toGregorianCalendar().getTime();
                            if(Double.parseDouble(healthProfile.getMeasureValue())
                                    - Double.parseDouble(healthMeasureHistory.getMeasureValue())>=0)
                            {
                                //gain weight
                                value_gain_loss = true;
                            }else
                            {
                                //lost weight
                                value_gain_loss = false;
                            }
                        }
                    }

                    if(value_gain_loss && diff_value!=0)
                    {
                        return "You have gained "+diff_value+" kg from "+big_diff_date+".";
                    }else if(!value_gain_loss && diff_value!=0)
                    {
                        return "You have lost "+diff_value+" kg from "+big_diff_date+".";
                    }
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "There is no Weight measure history of you in our system for the last 90 days.";
    }

    //reminds you to set a health measure
    public String measureSetReminder(Person person)
    {
        try
        {
            List<HealthProfile> healthProfileList = serviceStorage.readPerson(person.getIdPerson()).getCurrentHealth().getMeasure();
            Collections.sort(healthProfileList, new Comparator<HealthProfile>() {
                @Override
                public int compare(HealthProfile o1, HealthProfile o2) {
                    return o2.getDateRegistered().toGregorianCalendar().getTime().compareTo(o1.getDateRegistered().toGregorianCalendar().getTime());
                }
            });

            if(!healthProfileList.isEmpty())
                return "Your health measures have not been updated since "+healthProfileList.get(0).getDateRegistered().toGregorianCalendar().getTime().toString();
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "There are no Health Measures set for you.";
    }

    //reminds you to set a goal
    public String goalSetReminder(Person person)
    {
        try
        {
            List<Goal> goalList = serviceStorage.readLatestGoalList(person.getIdPerson());
            Collections.sort(goalList, new Comparator<Goal>() {
                @Override
                public int compare(Goal g1, Goal g2) {
                    return g2.getDateRegistered().toGregorianCalendar().getTime().compareTo(g1.getDateRegistered().toGregorianCalendar().getTime());
                }
            });

            if(!goalList.isEmpty())
                return "Your goals have not been updated since "+goalList.get(0).getDateRegistered().toGregorianCalendar().getTime().toString();
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "There are no Goals set for you.";
    }
}
