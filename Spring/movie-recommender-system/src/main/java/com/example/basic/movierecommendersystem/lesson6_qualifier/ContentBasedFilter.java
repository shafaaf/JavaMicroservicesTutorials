package com.example.basic.movierecommendersystem.lesson6_qualifier;

import org.springframework.stereotype.Component;

@Component("Content")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
