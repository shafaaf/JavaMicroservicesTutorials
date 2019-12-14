package com.in28minutes.junit.helper;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MiscTest {
    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(numbers, expected); // compare by value, not reference
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 1000)
    public void testArraySort_Performance() {
        int[] array = {12, 23, 4};
        for (int i = 0; i < 10000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
