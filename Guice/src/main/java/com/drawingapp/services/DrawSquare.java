package com.drawingapp.services;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

    private String color;
    private int edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue int edge) {
        super();
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing square of color: %s and edge: %s\n", color, edge);
    }
}
