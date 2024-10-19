package com.example.calculator.operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        assertEquals(5.0, addition.calculate(2, 3), 0.0);
    }
}
