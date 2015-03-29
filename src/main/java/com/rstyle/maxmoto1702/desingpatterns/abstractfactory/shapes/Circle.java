package com.rstyle.maxmoto1702.desingpatterns.abstractfactory.shapes;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 29.03.2015.
 */
public class Circle implements Shape {

    private static Logger LOG = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        LOG.info("Draw circle");
    }
}
