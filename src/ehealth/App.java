package ehealth;


import ehealth.controller_bl.ws.ServiceBLogicImpl;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;

public class App
{
    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException
    {
        /* //TEST
        StorageService storageService = new StorageService();
        ServiceStorage serviceStorage = storageService.getServiceStorageImplPort();

        Person tmp = serviceStorage.readPerson(Long.parseLong("1"));
        System.out.println(serviceStorage.readBmi(Double.parseDouble(tmp.getCurrentHealth().getMeasure().get(0).getMeasureValue()),
                Double.parseDouble(tmp.getCurrentHealth().getMeasure().get(1).getMeasureValue())));
        System.out.println(serviceStorage.readLatestGoalList(Long.parseLong("1")).get(0).getGoalValue());
        System.out.println(new GoalAchieve().compareWeightHeight(tmp));
        */
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1"))
        {
            HOSTNAME = "localhost";
        }
        String PORT = "6930";
        String BASE_URL = "/ws/bl";

        if (String.valueOf(System.getenv("PORT")) != "null"){
            PORT=String.valueOf(System.getenv("PORT"));
        }

        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting Storage Service...");
        System.out.println("--> Published. Check out "+endpointUrl+"?wsdl");
        Endpoint.publish(endpointUrl, new ServiceBLogicImpl());
    }

}
