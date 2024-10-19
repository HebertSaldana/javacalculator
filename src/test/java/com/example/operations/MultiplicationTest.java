package com.example.calculator.operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertEquals(6.0, multiplication.calculate(2, 3), 0.0);
    }
}
