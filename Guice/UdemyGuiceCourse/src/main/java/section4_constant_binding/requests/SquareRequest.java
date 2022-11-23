package section4_constant_binding.requests;

import com.google.inject.Inject;
import section4_constant_binding.services.DrawShape;

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
