package com.rstyle.maxmoto1702;

import com.rstyle.maxmoto1702.desingpatterns.AbstractFactoryPatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.BridgePatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.BuilderPatternDemo;
import com.rstyle.maxmoto1702.desingpatterns.AdapterPatternDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String... args) {
        AbstractFactoryPatternDemo.main(args);
        AbstractFactoryPatternDemo.main(args);
        BridgePatternDemo.main(args);
        BuilderPatternDemo.main(args);
    private static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        AdapterPatternDemo.main(args);
    }

    public int method() {
        int var = 0;
        LOG.debug("" + var);
        return var;
    }
}