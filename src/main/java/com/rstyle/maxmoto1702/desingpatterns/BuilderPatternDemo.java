package com.rstyle.maxmoto1702.desingpatterns;

import com.rstyle.maxmoto1702.desingpatterns.builder.Meal;
import com.rstyle.maxmoto1702.desingpatterns.builder.MealBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 12.04.2015.
 */
public class BuilderPatternDemo {

    private static final Logger LOG = LoggerFactory.getLogger(BuilderPatternDemo.class);

    public static void main(String... args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        LOG.info("Veg Meal");
        vegMeal.showItems();
        LOG.info("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        LOG.info("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        LOG.info("Total Cost: " + nonVegMeal.getCost());
    }
}
