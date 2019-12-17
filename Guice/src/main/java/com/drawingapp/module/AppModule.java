package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    // What interface mapped to what impl
    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);

        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    }
}
