package com.rstyle.maxmoto1702.desingpatterns.builder;

/**
 * Created by m on 12.04.2015.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
