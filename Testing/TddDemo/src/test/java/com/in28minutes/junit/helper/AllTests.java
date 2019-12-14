package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
    MiscTest.class,
    StringHelperParameterizedTest.class,
    StringHelperTest.class
})

public class AllTests {

}
