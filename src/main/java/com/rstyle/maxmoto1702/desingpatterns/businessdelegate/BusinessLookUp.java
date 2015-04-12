package com.rstyle.maxmoto1702.desingpatterns.businessdelegate;

/**
 * Created by m on 12.04.2015.
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else if (serviceType.equalsIgnoreCase("JMS")) {
            return new JMSService();
        } else {
            return null;
        }
    }
}
