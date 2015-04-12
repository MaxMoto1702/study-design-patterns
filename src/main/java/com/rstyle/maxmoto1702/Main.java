package com.rstyle.maxmoto1702;

import com.rstyle.maxmoto1702.desingpatterns.AbstractFactoryPatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.AdapterPatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.BridgePatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.BuilderPatternDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        AbstractFactoryPatternDemo.main(args);
        AdapterPatternDemo.main(args);
        BridgePatternDemo.main(args);
    }

    public static void main(String... args) {
        BuilderPatternDemo.main(args);
    }

    public int method() {
        int var = 0;
        LOG.debug("" + var);
        return var;
    }
}