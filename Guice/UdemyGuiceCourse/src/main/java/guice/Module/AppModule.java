package guice.Module;

import com.google.inject.AbstractModule;
import guice.Services.DrawShape;
import guice.Services.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
