package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractControllerTest {
    private CalculatorService calculatorService;
    private SubtractController subtractController;

    @BeforeEach
    public void setup() {
        calculatorService = Mockito.mock(CalculatorService.class);
        subtractController = new SubtractController(calculatorService);
    }

    @Test
    public void subtract() {
        Mockito.when(calculatorService.subtract(Mockito.anyInt(), Mockito.anyInt())).thenReturn(30);

        int result = subtractController.subtract(60, 30);
        assertEquals(30, result);
    }
}
