package com.example.calculator.operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        assertEquals(1.0, subtraction.calculate(3, 2), 0.0);
    }
}
