package noGuice;

import noGuice.Requests.SquareRequest;
import noGuice.Services.DrawShape;
import noGuice.Services.DrawSquare;

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
        sendRequest(SQUARE_REQ);
    }

}