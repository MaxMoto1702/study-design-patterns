package com.rstyle.maxmoto1702.desingpatterns.builder;

/**
 * Created by m on 12.04.2015.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
