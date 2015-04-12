package com.rstyle.maxmoto1702.desingpatterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m on 12.04.2015.
 */
public class Meal {

    private static final Logger LOG = LoggerFactory.getLogger(Meal.class);

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            LOG.info("Item : " + item.name() +
                    ", Packing : " + item.packing().pack() +
                    ", Price : " + item.price());
        }
    }
}
