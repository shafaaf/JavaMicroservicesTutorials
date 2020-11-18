package com.spring.basics.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public int binarySearch (int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        // TODO: Implement binary search
        System.out.println("sortAlgorithm used is: " + sortAlgorithm.toString());
        return 3;
    }
}
