package com.example.primaryQualifier;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
    public void process() {
        System.out.println("MediaTek processing");
    }
}
