package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideControllerTest {
    private CalculatorService calculatorService;
    private DivideController divideController;

    @BeforeEach
    public void setup() {
        calculatorService = Mockito.mock(CalculatorService.class);
        divideController = new DivideController(calculatorService);
    }

    @Test
    public void divide() {
        Mockito.when(calculatorService.divide(Mockito.anyInt(), Mockito.anyInt())).thenReturn(3);

        int result = divideController.divide(6, 2);
        assertEquals(3, result);
    }
}
