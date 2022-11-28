package section2_guice.requests;

import com.google.inject.Inject;
import section2_guice.services.DrawShape;

public class SquareRequest {
    DrawShape d;

    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }
}
