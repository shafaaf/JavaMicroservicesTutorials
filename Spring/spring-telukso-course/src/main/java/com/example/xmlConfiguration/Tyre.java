package com.example.xmlConfiguration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

    @Getter @Setter
    private String brand;

    @Override
    public String toString() {
        return "Tyre [brand = " + brand + "]";
    }
}
