package com.rstyle.maxmoto1702.desingpatterns;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.AbstractFactory;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Color;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Shape;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.factories.FactoryProducer;

/**
 * Created by MaxMoto1702 on 29.03.2015.
 *
 * Шаблон "Абстрактная фабрика" используется для фабрики фабрик.
 *
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides
 * one of the best ways to create an object.
 * In Abstract Factory pattern an interface is responsible for creating a factory of
 * related objects without explicitly specifying their classes.
 * Each generated factory can give the objects as per the Factory pattern.
 *
 *
 */
public class AbstractFactoryPatternDemo {

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
