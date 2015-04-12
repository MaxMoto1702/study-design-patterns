package com.rstyle.maxmoto1702.desingpatterns;

import com.rstyle.maxmoto1702.desingpatterns.businessdelegate.BusinessDelegate;
import com.rstyle.maxmoto1702.desingpatterns.businessdelegate.Client;

/**
 * Created by m on 12.04.2015.
 */
public class BusinessDelegatePatternDemo {

    public static void main(String... args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
