package com.tp1.app.controllers;

import com.tp1.app.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqrt")
public class SQRTController {
    private final CalculatorService calculatorService;

    public SQRTController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public double sqrt(@RequestParam int x) {
        return calculatorService.sqrt(x);
    }
}
