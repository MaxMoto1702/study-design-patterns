package com.rstyle.maxmoto1702.desingpatterns.abstractfactory;

/**
 * Created by m on 29.03.2015.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
