package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class AddController {
    private final CalculatorService calculatorService;

    public AddController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }
}
