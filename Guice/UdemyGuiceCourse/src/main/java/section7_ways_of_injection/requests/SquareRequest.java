package section7_ways_of_injection.requests;

import com.google.inject.Inject;
import section7_ways_of_injection.services.DrawShape;

// Use one from the following injection procedures

public class SquareRequest {
    // 3. Field injection
    @Inject
    DrawShape d;

    // 1. Constructor injection
//    @Inject
//    public SquareRequest(DrawShape d) {
//        System.out.println("Using Constructor injection");
//        this.d = d;
//    }

    // 2. Method injection - calls all args constructor and then this
//    @Inject
//    public void setDrawShape(DrawShape d) {
//        System.out.println("Using Method injection");
//        this.d = d;
//    }

    public void makeRequest(){
        d.draw();
    }

}
