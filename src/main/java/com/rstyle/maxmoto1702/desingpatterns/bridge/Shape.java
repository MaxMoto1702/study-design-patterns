package com.rstyle.maxmoto1702.desingpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public abstract class Shape {

    private static final Logger LOG = LoggerFactory.getLogger(Shape.class);

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
