package com.rstyle.maxmoto1702.desingpatterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    private static final Logger LOG = LoggerFactory.getLogger(Mp4Player.class);

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        LOG.info("Playing MP4 file. Name: " + fileName);
    }
}
