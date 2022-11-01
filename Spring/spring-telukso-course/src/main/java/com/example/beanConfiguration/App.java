package com.example.beanConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Tutorial from: https://youtu.be/5zUTc-kge8I?list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk
public class App {

    public static void main(String[] args) {
        System.out.println("Hi2");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung = applicationContext.getBean(Samsung.class);
        samsung.config();

    }
}

