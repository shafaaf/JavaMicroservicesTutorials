package com.example.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle vehicle = (Vehicle) context.getBean("vehicle");

        // Vehicle vehicle = new Car();
        vehicle.drive();
    }
}
