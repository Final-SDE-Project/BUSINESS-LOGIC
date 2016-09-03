package ehealth.controller_bl.ws;

import ehealth.controller_db.ws.Person;
import ehealth.model.bl.GoalAchieve;
import ehealth.model.bl.Motivation;
import ehealth.model.bl.Reminder;

import javax.jws.WebService;

/**
 * Created by Navid on 9/1/2016.
 */

@WebService(endpointInterface = "ehealth.controller_bl.ws.ServiceBl", serviceName="BlService")
public class ServiceBLogicImpl implements ServiceBl
{
    @Override
    public String readGoalStatus(Person person, String measureType)
    {
        return new GoalAchieve().compare(person, measureType);
    }

    @Override
    public String readSteps(Person person, int days)
    {
        return new Motivation().stepCount(person, days);
    }

    @Override
    public String updateIdealWeight(Person person)
    {
        return new Reminder().idealWeightReminder_SetGoal(person);
    }

    @Override
    public String readBigWeightChange(Person person)
    {
        return new Reminder().weightChangeReminder(person);
    }

    @Override
    public String readMeasureReminder(Person person)
    {
        return new Reminder().measureSetReminder(person);
    }

    @Override
    public String readGoalReminder(Person person)
    {
        return new Reminder().goalSetReminder(person);
    }



}
