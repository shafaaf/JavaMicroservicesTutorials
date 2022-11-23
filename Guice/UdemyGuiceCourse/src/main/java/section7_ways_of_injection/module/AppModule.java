package section7_ways_of_injection.module;

import com.google.inject.AbstractModule;
import section7_ways_of_injection.services.DrawShape;
import section7_ways_of_injection.services.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
