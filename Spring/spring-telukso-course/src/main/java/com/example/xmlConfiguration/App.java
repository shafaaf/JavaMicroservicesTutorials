package com.example.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    // Tutorial: https://www.youtube.com/watch?v=VIaBbNaYDaU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=11&ab_channel=Telusko - 4/12

    public static void main(String[] args) {
        System.out.println("This is xmlConfiguration examples");

        // this is responsible for giving me the beans
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

