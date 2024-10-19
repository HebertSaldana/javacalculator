package com.example.calculator.operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testDivision() {
        Division division = new Division();
        assertEquals(2.0, division.calculate(6, 3), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Division division = new Division();
        division.calculate(1, 0); // This should throw an exception
    }
}
