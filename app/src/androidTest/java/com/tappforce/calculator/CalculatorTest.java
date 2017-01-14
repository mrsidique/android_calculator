package com.tappforce.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by reyaadsidique on 1/13/17.
 */
@RunWith(AndroidJUnit4.class)
public class CalculatorTest {

    @Test
    public void testAddition() throws Exception {
        double expectedResult = 20;
        Calculator calculator = new Calculator();
        calculator.setValue1(12);
        calculator.setValue2(8);
        calculator.setSelectedOperandWithOperandString("+");
        double result = calculator.performOperation();
        assertEquals(expectedResult, result, expectedResult - result);
    }

    @Test
    public void testSubtraction() throws Exception {
        double expectedResult = 10;
        Calculator calculator = new Calculator();
        calculator.setValue1(20);
        calculator.setValue2(10);
        calculator.setSelectedOperandWithOperandString("-");
        double result = calculator.performOperation();
        assertEquals(expectedResult, result, expectedResult - result);
    }
}
