package section6_singleton;

import com.google.inject.Guice;
import com.google.inject.Injector;
import section6_singleton.module.AppModule;
import section6_singleton.requests.SquareRequest;

public class SingletonDemo {
    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq) {
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request1 = injector.getInstance(SquareRequest.class);
            request1.makeRequest();

            SquareRequest request2 = injector.getInstance(SquareRequest.class);
            request2.makeRequest();

            System.out.println();
            boolean areDrawShapesEqual = request1.getDrawShape() == request2.getDrawShape();
            System.out.println("Were Draw Shapes equal : " + areDrawShapesEqual);
            // Fix was in AppModule.java, when we add in
            // this line : bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON)
            // can also do: @Singleton on SquareRequest class


            // Fix was in AppModule.java, when we add in
            // this line : bind(SquareRequest.class).in(Scopes.SINGLETON);
            // or add in singleton annotation in SquareRequest
            boolean areSquareRequestEqual = request1 == request2;
            System.out.println("Were Square requests equal : " + areSquareRequestEqual);
        }
    }

    public static void main(String[] args) {
        System.out.println("Singleton Demo");
        sendRequest(SQUARE_REQ);
    }
}
