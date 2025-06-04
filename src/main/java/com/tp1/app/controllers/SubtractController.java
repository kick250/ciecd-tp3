package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subtract")
public class SubtractController {
    private final CalculatorService calculatorService;

    public SubtractController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }
}
