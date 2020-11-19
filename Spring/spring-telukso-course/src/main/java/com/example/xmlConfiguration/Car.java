package com.example.xmlConfiguration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired @Getter @Setter
    private Tyre tyre;

    public void drive() {
        System.out.println("Car driving with tyre: " + tyre);
    }
}
