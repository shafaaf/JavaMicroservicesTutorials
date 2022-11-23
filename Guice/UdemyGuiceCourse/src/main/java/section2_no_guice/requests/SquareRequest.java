package section2_no_guice.requests;

import section2_no_guice.services.DrawShape;

public class SquareRequest {
    DrawShape d;

    public SquareRequest(DrawShape d){
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }
}
