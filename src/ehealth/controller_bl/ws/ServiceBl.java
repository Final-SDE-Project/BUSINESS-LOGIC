package ehealth.controller_bl.ws;

import ehealth.controller_db.ws.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Navid on 9/1/2016.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL) //optional
public interface ServiceBl
{
    @WebMethod(operationName="readGoalStatus")
    @WebResult(name="goalStatus")
    public String readGoalStatus(@WebParam(name="person") Person person,@WebParam(name="measureType") String measureType);

    @WebMethod(operationName="readSteps")
    @WebResult(name="stepStatus")
    public String readSteps(@WebParam(name="person") Person person,@WebParam(name="days") int days);

    @WebMethod(operationName="updateIdealWeight")
    @WebResult(name="idealWeight")
    public String updateIdealWeight(@WebParam(name="person") Person person);

    @WebMethod(operationName="readBigWeightChange")
    @WebResult(name="weightChange")
    public String readBigWeightChange(@WebParam(name="person") Person person);

    @WebMethod(operationName="readMeasureReminder")
    @WebResult(name="measureReminder")
    public String readMeasureReminder(@WebParam(name="person") Person person);

    @WebMethod(operationName="readGoalReminder")
    @WebResult(name="goalReminder")
    public String readGoalReminder(@WebParam(name="person") Person person);
}
