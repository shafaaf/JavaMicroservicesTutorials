package section6_singleton.requests;

import com.google.inject.Inject;
import section6_singleton.services.DrawShape;

// can also make singleton for SquareRequest using @Singleton like below
//@Singleton
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

    public DrawShape getDrawShape(){
        return d;
    }
}
