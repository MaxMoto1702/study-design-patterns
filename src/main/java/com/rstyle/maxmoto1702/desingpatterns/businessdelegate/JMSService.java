package com.rstyle.maxmoto1702.desingpatterns.businessdelegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class JMSService implements BusinessService {

    private static final Logger LOG = LoggerFactory.getLogger(JMSService.class);

    @Override
    public void doProcessing() {
        LOG.info("Processing task by invoking JMS Service");
    }
}
