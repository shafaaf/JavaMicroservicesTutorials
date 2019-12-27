package com.drawingapp.services;

public class DrawSquare implements DrawShape {

    private String color;
    private int edge;

    //@Inject
    public DrawSquare(String color, int edge) {
        super();
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing square of color: %s and edge: %s\n", color, edge);
    }
}
