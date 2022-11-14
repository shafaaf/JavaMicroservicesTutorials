package com.example.basic.movierecommendersystem.lesson5_autowiringByName;

import org.springframework.stereotype.Component;

//@Primary
@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"oppa"};
    }
}
