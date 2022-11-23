package section2_guice.module;

import com.google.inject.AbstractModule;
import section2_guice.services.DrawShape;
import section2_guice.services.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
