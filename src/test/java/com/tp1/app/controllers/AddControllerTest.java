package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class AddControllerTest {
    private CalculatorService calculatorService;
    private AddController addController;

    @BeforeEach
    public void setup() {
        calculatorService = Mockito.mock(CalculatorService.class);
        addController = new AddController(calculatorService);
    }

    @Test
    public void add() {
        Mockito.when(calculatorService.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(30);

        int result = addController.add(10, 20);
        assertEquals(30, result);
    }
}
