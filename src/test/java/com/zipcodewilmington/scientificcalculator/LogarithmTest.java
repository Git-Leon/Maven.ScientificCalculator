package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.Logarithm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogarithmTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void LogarithmTest1() {
        // given
        Logarithm result = new Logarithm();
        Integer inputValue = 1;
        double expected = Math.log(inputValue);

        // when
        double actual = result.logarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }

    @Test
    public void LogarithmTest2() {
        // given
        Logarithm result = new Logarithm();
        Integer inputValue = 45;
        double expected = Math.log(inputValue);

        // when
        double actual = result.logarithm(inputValue);

        // then
        assertEquals(expected, actual, .00);
    }
}