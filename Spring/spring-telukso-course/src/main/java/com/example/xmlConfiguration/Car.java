package com.example.xmlConfiguration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// annotation based configuration
// then don't have to mention in xml file
// same like writing this line in xml but id would be like class name in lowercase
// need to add in line context:annotation config in xml file
@Component
public class Car implements Vehicle {

    // with autowired, will go to xml file and see if have that and use it accordingly
    @Autowired @Getter @Setter
    private Tyre tyre;

    public void drive() {
        System.out.println("Car driving with tyre: " + tyre);
    }
}
