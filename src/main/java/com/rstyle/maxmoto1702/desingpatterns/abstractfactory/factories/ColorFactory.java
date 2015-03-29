package com.rstyle.maxmoto1702.desingpatterns.abstractfactory.factories;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.AbstractFactory;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Color;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Shape;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.colors.Blue;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.colors.Green;
import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.colors.Red;

/**
 * Created by m on 29.03.2015.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else {
            return null;
        }
    }
}
