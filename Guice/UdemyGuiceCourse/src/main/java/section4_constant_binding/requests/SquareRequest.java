package section4_constant_binding.requests;

import com.google.inject.Inject;
import section4_constant_binding.services.DrawShape;

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
