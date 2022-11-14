package com.spring.basics.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Using QuickSortAlgorithm");
        return numbers;
    }
}
