package com.rstyle.maxmoto1702.desingpatterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    private static final Logger LOG = LoggerFactory.getLogger(VlcPlayer.class);

    @Override
    public void playVlc(String fileName) {
        LOG.info("Plaing VLC file. Name " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
