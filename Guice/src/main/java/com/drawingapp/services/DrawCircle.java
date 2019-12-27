package com.drawingapp.services;

public class DrawCircle implements DrawShape {

    private String color;
    private int radius;

    public DrawCircle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing circle of color: %s and radius: %s\n", color, radius);
    }
}
