package com.example.beanConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    MobileProcessor cpu;

    public void config() {
        System.out.println("Octa core, 4 gb ram, 12MP camera");
        cpu.process();
    }
}
