package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringHelperTest {

    @Test
    public void truncateAInFirst2Positions() {
        StringHelper stringHelper = new StringHelper();
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
        System.out.println("areFirstAndLastTwoCharactersTheSame");
    }
}
