package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequestNoGuice(String squareReq) {
        DrawShape d = new DrawSquare("Red", 40);
        SquareRequest request = new SquareRequest(d);
        request.makeRequest();
    }

    private static void sendRequestGuice(String squareReq) {
        Injector injector = Guice.createInjector(new AppModule());
        SquareRequest request1 = injector.getInstance(SquareRequest.class);
        request1.makeRequest();

        SquareRequest request2 = injector.getInstance(SquareRequest.class);
        request2.makeRequest();

        System.out.println("Were Square requests equal: " + (request1 == request2));
    }

    public static void main(String[] args) {
        //sendRequestNoGuice(SQUARE_REQ);
        sendRequestGuice(SQUARE_REQ);
    }

}
