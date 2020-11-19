package com.example.primaryQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi3");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.config();

    }
}

