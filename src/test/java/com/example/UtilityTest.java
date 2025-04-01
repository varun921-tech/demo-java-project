package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilityTest {
    @Test
    public void testAddNumbers() {
        int result = Utility.addNumbers(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplyNumbers() {
        int result = Utility.multiplyNumbers(4, 6);
        assertEquals(24, result);
    }
}