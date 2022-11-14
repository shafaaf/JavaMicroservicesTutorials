package com.example.basic.movierecommendersystem.lesson3_componentAutowired;

//@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"oppa"};
    }
}
