package com.spring.basics.springdemo;

import org.springframework.stereotype.Component;

// this @component here says to use this impl
@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Using BubbleSortAlgorithm");
        return numbers;
    }
}
