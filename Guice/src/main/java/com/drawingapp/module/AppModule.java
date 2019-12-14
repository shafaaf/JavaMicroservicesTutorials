package com.drawingapp.module;

import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    // What interface mapped to what impl
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
