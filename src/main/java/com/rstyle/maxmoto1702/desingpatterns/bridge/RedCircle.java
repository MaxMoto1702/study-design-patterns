package com.rstyle.maxmoto1702.desingpatterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class RedCircle implements DrawAPI {

    private static final Logger LOG = LoggerFactory.getLogger(RedCircle.class);

    @Override
    public void drawCircle(int radius, int x, int y) {
        LOG.info("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
