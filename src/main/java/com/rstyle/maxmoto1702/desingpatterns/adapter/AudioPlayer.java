package com.rstyle.maxmoto1702.desingpatterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class AudioPlayer implements MediaPlayer {

    private static final Logger LOG = LoggerFactory.getLogger(AudioPlayer.class);

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            LOG.info("Plaing mp3 file. Name " + fileName);
        } else {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }
    }
}
