package section2_no_guice;

import section2_no_guice.requests.SquareRequest;
import section2_no_guice.services.DrawShape;
import section2_no_guice.services.DrawSquare;

public class NoGuiceDemo { 

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq) {
        if(squareReq.equals(SQUARE_REQ)){
            DrawShape d = new DrawSquare();
            SquareRequest request = new SquareRequest(d);
            request.makeRequest();
        }
    }

    public static void main(String[] args) {
        System.out.println("No Guice Demo");
        sendRequest(SQUARE_REQ);
    }
}
