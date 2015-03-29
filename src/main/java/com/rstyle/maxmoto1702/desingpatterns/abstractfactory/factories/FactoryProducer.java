package com.rstyle.maxmoto1702.desingpatterns.abstractfactory.factories;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.AbstractFactory;

/**
 * Created by m on 29.03.2015.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
