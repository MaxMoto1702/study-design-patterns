package com.rstyle.maxmoto1702.desingpatterns.businessdelegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class EJBService implements BusinessService {

    private static final Logger LOG = LoggerFactory.getLogger(EJBService.class);

    @Override
    public void doProcessing() {
        LOG.info("Processing task by invoking EJB Service");
    }
}
