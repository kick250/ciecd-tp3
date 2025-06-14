package com.tp1.app.services;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double sqrt(int x) {
        return Math.sqrt(x);
    }
}
