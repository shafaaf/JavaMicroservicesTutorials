package section4_constant_binding;

import com.google.inject.Guice;
import com.google.inject.Injector;
import section4_constant_binding.module.AppModule;
import section4_constant_binding.requests.SquareRequest;

public class ConstantBindingDemo {
    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq) {
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }
    }

    public static void main(String[] args) {
        System.out.println("Constant binding demo");
        sendRequest(SQUARE_REQ);
    }
}
