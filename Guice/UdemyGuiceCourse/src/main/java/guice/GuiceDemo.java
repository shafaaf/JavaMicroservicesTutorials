package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.Module.AppModule;
import guice.Requests.SquareRequest;

public class GuiceDemo {
    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq) {
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }
    }

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
}
