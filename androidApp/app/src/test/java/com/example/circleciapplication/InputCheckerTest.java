package com.example.circleciapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InputCheckerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValid() {
        InputChecker ic = new InputChecker();
        Boolean actual = ic.isValid("foo");
        assertThat(actual, is(true));
    }
}