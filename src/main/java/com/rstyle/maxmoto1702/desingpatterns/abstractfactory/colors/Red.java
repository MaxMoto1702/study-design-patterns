package com.rstyle.maxmoto1702.desingpatterns.abstractfactory.colors;

import com.rstyle.maxmoto1702.desingpatterns.abstractfactory.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 29.03.2015.
 */
public class Red implements Color {

    private static Logger LOG = LoggerFactory.getLogger(Red.class);

    @Override
    public void fill() {
        LOG.info("Fill red");
    }
}
