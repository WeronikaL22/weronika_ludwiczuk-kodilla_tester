package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);

    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int a = -1;
        int b = 0;
        int c = 2;

        int powerResult = calculator.power(a);
        assertEquals(1, powerResult);
        int powerResultB = calculator.power(b);
        assertEquals(0, powerResultB);
        int powerResultC = calculator.power(c);
        assertEquals(4,powerResultC);


    }

}

