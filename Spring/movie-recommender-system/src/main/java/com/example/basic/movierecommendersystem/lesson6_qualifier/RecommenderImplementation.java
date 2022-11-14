package com.example.basic.movierecommendersystem.lesson6_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("Content")
    Filter collaborativeFilter;

    public String[] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations("Finding Dory");

        return results;
    }
}