package com.example.basic.movierecommendersystem.lesson7_constructorAndSetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    Filter filter;

    //constructor injection
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}
