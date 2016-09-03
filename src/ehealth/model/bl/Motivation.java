package ehealth.model.bl;

import ehealth.controller_db.ws.HealthMeasureHistory;
import ehealth.controller_db.ws.HealthProfile;
import ehealth.controller_db.ws.Person;
import ehealth.controller_storage.ws.ServiceStorage;
import ehealth.controller_storage.ws.StorageService;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Navid on 8/30/2016.
 */
public class Motivation {
    private StorageService storageService = new StorageService();
    private ServiceStorage serviceStorage = storageService.getServiceStorageImplPort();

    //I can go back in time more to find period with walking days more than threshold of 6550
    public String stepCount(Person person, int days)
    {
        boolean flag_step = false;//this will be set to true if there is steps in measures
        try
        {
            List<HealthProfile> healthProfileList = serviceStorage.readPerson(person.getIdPerson()).getCurrentHealth().getMeasure();
            for(HealthProfile healthProfile: healthProfileList)
            {
                //This feature is for walking
                if((healthProfile.getMeasureType().equals("steps")))
                {
                    flag_step = true;
                    //Define date of now
                    Calendar now = Calendar.getInstance();
                    GregorianCalendar beforeDate = new GregorianCalendar();
                    beforeDate.setTime(now.getTime());
                    XMLGregorianCalendar nowDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(beforeDate);

                    //Define date a week before now (if days equals = 7)
                    now.add(Calendar.DATE, -1*days);
                    GregorianCalendar afterDate = new GregorianCalendar();
                    afterDate.setTime(now.getTime());//this is 7 days ago
                    XMLGregorianCalendar afterDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(afterDate);

                    //Get list of History measures of 'STEPS' in a week period before now (if days equals = 7)
                    List<HealthMeasureHistory> healthMeasureHistoryList =
                            serviceStorage.readMeasureHistoriesByDate(person.getIdPerson(), healthProfile.getMeasureType(),
                                    nowDateXML,afterDateXML);

                    double steps = Double.parseDouble(healthProfile.getMeasureValue());
                    for(HealthMeasureHistory healthMeasureHistory:healthMeasureHistoryList)
                    {
                        steps += Double.parseDouble(healthMeasureHistory.getMeasureValue());
                    }

                    if (steps>=6550)//nearly 5km of walking
                    {
                        return "Congratulations, you have walked "+steps+" step(s) (nearly "+ (steps/1310.0) +"km) during the last "+days+" days. ";
                    }
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        if (!flag_step)
        {
            return "You should enter your steps measures in the app first.";
        }
        return "Sorry, but no achievements for your walking activities!";
    }
}
