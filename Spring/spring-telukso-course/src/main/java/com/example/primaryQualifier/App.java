package com.example.primaryQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Tutorial: https://www.youtube.com/watch?v=VIaBbNaYDaU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=11&ab_channel=Telusko
public class App {

    public static void main(String[] args) {
        System.out.println("Hi3");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.config();
        System.out.println("End");

    }
}

