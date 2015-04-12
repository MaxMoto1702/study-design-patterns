package com.rstyle.maxmoto1702.desingpatterns.businessdelegate;

/**
 * Created by m on 12.04.2015.
 */
public class Client {

    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
