package com.rstyle.maxmoto1702.desingpatterns.builder;

/**
 * Created by m on 12.04.2015.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
