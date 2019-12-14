package com.in28minutes.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    private StringHelper stringHelper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection <String[]> testConditons() {
        String [][] outputs = {
            {"AACD", "CD"},
            {"ACD", "CD"}
        };
        return Arrays.asList(outputs);
    }

    // testing truncateAInFirst2Positions
    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }
}


