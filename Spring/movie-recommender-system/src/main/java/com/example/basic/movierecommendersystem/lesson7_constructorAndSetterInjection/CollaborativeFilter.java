package com.example.basic.movierecommendersystem.lesson7_constructorAndSetterInjection;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"oppa"};
    }
}
