package com.tp1.app.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void add() {
        assertEquals(1, calculatorService.add(1, 0));
    }

    @Test
    public void subtract() {
        assertEquals(1, calculatorService.subtract(1, 0));
    }

    @Test
    public void multiply() {
        assertEquals(1, calculatorService.multiply(1, 1));
    }

    @Test
    public void divide() {
        assertEquals(1, calculatorService.divide(1, 1));
    }
}
