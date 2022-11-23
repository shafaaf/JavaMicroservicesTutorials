package section6_singleton.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import section6_singleton.annotations.ColorValue;
import section6_singleton.annotations.EdgeValue;
import section6_singleton.requests.SquareRequest;
import section6_singleton.services.DrawShape;
import section6_singleton.services.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
        bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
