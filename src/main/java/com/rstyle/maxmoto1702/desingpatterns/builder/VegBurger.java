package com.rstyle.maxmoto1702.desingpatterns.builder;

/**
 * Created by m on 12.04.2015.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
