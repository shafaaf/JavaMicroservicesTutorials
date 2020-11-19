package com.example.primaryQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired @Qualifier("mediaTek")
    MobileProcessor cpu;

    public void config() {
        System.out.println("Octa core, 4 gb ram, 12MP camera");
        cpu.process();
    }
}
