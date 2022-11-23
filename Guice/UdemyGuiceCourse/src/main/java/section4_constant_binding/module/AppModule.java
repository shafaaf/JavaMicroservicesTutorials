package section4_constant_binding.module;

import com.google.inject.AbstractModule;
import section4_constant_binding.annotations.ColorValue;
import section4_constant_binding.annotations.EdgeValue;
import section4_constant_binding.services.DrawShape;
import section4_constant_binding.services.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    }
}
