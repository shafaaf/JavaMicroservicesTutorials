package com.example.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("This is xmlConfiguration examples");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

        System.out.println("Asking for car:");
        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();
        System.out.println();

        System.out.println("Asking for tyre:");
        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre.toString());
        System.out.println();

        System.out.println("Asking for someVehicle:");
        Vehicle someVehicle = (Vehicle) context.getBean("someVehicle");
        someVehicle.drive();
        System.out.println();

    }
}

