package com.rstyle.maxmoto1702.desingpatterns.businessdelegate;

/**
 * Created by m on 12.04.2015.
 */
public class BusinessDelegate {

    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void doTask() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
