package com.example.basic.movierecommendersystem.lesson1_basic;

public class RecommenderImplementation {

    public String[] recommendMovies (String movie) {

        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendations("Finding Dory");
    }
}
