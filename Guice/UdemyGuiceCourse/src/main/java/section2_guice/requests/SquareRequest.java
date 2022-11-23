package section2_guice.requests;

import com.google.inject.Inject;
import section2_guice.services.DrawShape;

public class SquareRequest {
    // can also remove SquareRequest constructor and inject on the member variable below
    DrawShape d;

    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }
}
