package com.rstyle.maxmoto1702.desingpatterns.bridge;

/**
 * Created by m on 12.04.2015.
 */
public class Circle extends Shape {
    int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
