package com.example.basic.movierecommendersystem.lesson5_autowiringByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    Filter collaborativeFilter;

    public String[] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations("Finding Dory");

        return results;
    }
}
