package section7_ways_of_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import section7_ways_of_injection.module.AppModule;
import section7_ways_of_injection.requests.SquareRequest;

public class WaysOfInjectionDemo {
    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq) {
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request1 = injector.getInstance(SquareRequest.class);
            request1.makeRequest();
        }
    }

    public static void main(String[] args) {
        System.out.println("WaysOfInjection Demo");
        sendRequest(SQUARE_REQ);
    }
}
