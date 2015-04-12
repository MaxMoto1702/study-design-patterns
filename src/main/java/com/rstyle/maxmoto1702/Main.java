package com.rstyle.maxmoto1702;

import com.rstyle.maxmoto1702.desingpatterns.AbstractFactoryDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        AbstractFactoryDemo.main(args);
    }

    public int method() {
        int var = 0;
        LOG.debug("" + var);
        return var;
    }
}