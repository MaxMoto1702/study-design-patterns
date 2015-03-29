package com.rstyle.maxmoto1702.desingpatterns.abstractfactory.factories;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.AbstractFactory;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Color;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Shape;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.shapes.Circle;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.shapes.Rectangle;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.shapes.Square;

/**
 * Created by m on 29.03.2015.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
