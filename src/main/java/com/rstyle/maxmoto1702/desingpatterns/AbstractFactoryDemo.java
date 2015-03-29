package com.rstyle.maxmoto1702.desingpatterns;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.AbstractFactory;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Color;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Shape;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.factories.FactoryProducer;

/**
 * Created by m on 29.03.2015.
 */
public class AbstractFactoryDemo {

    public static void main(String... args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color blue = colorFactory.getColor("blue");
        blue.fill();

        Color green = colorFactory.getColor("green");
        green.fill();

        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
