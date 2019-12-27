package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.CircleRequest;
import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequestNoGuice(String shapeReq) {
        DrawShape d = new DrawSquare("Red", 40);
        SquareRequest request = new SquareRequest(d);
        request.makeRequest();
    }

    private static void sendRequestGuice(String shapeReq) {
        if (shapeReq.equals(SQUARE_REQ)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }
//        else if (shapeReq.equals(CIRCLE_REQ)) {
//            Injector injector = Guice.createInjector(new AppModule());
//            CircleRequest request = injector.getInstance(CircleRequest.class);
//            request.makeRequest();
//        }
    }

    public static void main(String[] args) {
        //sendRequestNoGuice(SQUARE_REQ);
        sendRequestGuice(SQUARE_REQ);
        sendRequestGuice(CIRCLE_REQ);
    }

}
