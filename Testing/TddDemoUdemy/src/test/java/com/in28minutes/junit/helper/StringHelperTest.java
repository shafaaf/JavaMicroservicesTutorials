package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    private StringHelper stringHelper = new StringHelper();


    // testing truncateAInFirst2Positions
    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_noAs() {
        assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AsAtTheEnd() {
        assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
    }


    // testing areFirstAndLastTwoCharactersTheSame
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_TwoCharScenario() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_OneCharScenario() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}
