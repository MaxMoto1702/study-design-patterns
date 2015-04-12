package com.rstyle.maxmoto1702.desingpatterns.builder;

/**
 * Created by m on 12.04.2015.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
