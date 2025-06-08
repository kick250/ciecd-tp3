package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRTControllerTest {
    private CalculatorService calculatorService;
    private SQRTController sqrtController;

    @BeforeEach
    public void setup() {
        calculatorService = Mockito.mock(CalculatorService.class);
        sqrtController = new SQRTController(calculatorService);
    }

    @Test
    public void sqrt() {
        Mockito.when(calculatorService.sqrt(Mockito.anyInt())).thenReturn(5.0);

        double result = sqrtController.sqrt(25);
        assertEquals(5, result);
    }
}
