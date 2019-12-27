package com.drawingapp.module;

import com.drawingapp.annotations.*;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class AppModule extends AbstractModule {

    // What interface mapped to what impl
    @Override
    protected void configure() {
        //bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
        //bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);

        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Grey");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(143);

        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Black");
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(10);
    }

    @Provides
    @Singleton
    @Square
    DrawShape providesDrawSquare(@SquareColorValue String color, @EdgeValue int edge) {
        return new DrawSquare(color, edge);
    }

    @Provides
    @Singleton
    @Circle
    DrawShape providesDrawCircle(@CircleColorValue String color, @RadiusValue int radius) {
        return new DrawCircle(color, radius);
    }

}
