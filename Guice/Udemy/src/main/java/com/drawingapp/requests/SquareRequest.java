package com.drawingapp.requests;

import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
    DrawShape d;

    @Inject
    public SquareRequest(@Square DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
