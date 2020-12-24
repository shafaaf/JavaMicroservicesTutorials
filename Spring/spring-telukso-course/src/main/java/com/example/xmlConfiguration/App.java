package com.example.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();

//        Tyre tyre = (Tyre) context.getBean("tyre");
//        System.out.println(tyre.toString());

    }
}

