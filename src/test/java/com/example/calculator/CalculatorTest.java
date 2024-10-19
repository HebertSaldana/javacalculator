package com.example.calculator;

import com.example.calculator.operations.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        Map<String, Operation> operations = new HashMap<>();
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
        calculator = new Calculator(operations);
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.calculate("+", 2, 3), 0.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.calculate("-", 3, 2), 0.0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.calculate("*", 2, 3), 0.0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.calculate("/", 6, 3), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.calculate("/", 1, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testInvalidOperation() {
        calculator.calculate("%", 1, 1); // Operation not supported
    }
}
