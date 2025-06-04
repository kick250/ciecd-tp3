package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyControllerTest {
    private CalculatorService calculatorService;
    private MultiplyController multiplyController;

    @BeforeEach
    public void setup() {
        calculatorService = Mockito.mock(CalculatorService.class);
        multiplyController = new MultiplyController(calculatorService);
    }

    @Test
    public void multiply() {
        Mockito.when(calculatorService.multiply(Mockito.anyInt(), Mockito.anyInt())).thenReturn(30);

        int result = multiplyController.multiply(5, 6);
        assertEquals(30, result);
    }
}
