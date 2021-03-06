package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.Cosine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CosineTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void cosineTest1() {
        // given
        Cosine result = new Cosine();
        double inputValue = 45;
        double expected;
        if(inputValue < 0) {
            expected = Math.cos(-inputValue);
        } else {
            expected = Math.cos(inputValue);
        }

        // when
        double actual = result.cosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest2() {
        // given
        Cosine result = new Cosine();
        double inputValue = 90;
        double expected;
        if(inputValue < 0) {
            expected = Math.cos(-inputValue);
        } else {
            expected = Math.cos(inputValue);
        }

        // when
        double actual = result.cosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }

    @Test
    public void cosineTest3() {
        // given
        Cosine result = new Cosine();
        double inputValue = -810;
        double expected;
        if(inputValue < 0) {
            expected = Math.cos(-inputValue);
        } else {
            expected = Math.cos(inputValue);
        }

        // when
        double actual = result.cosine(inputValue);

        // then
        assertEquals(expected, actual, .00000);
    }
}