package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/multiply")
public class MultiplyController {
    private final CalculatorService calculatorService;

    public MultiplyController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }
}
