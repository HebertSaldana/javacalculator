    package com.example.calculator;

import com.example.calculator.operations.Operation;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations;

    // Constructor que inyecta el mapa de operaciones
    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }

    // Método para realizar el cálculo según el operador
    public double calculate(String operator, double a, double b) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new UnsupportedOperationException("Operation not supported");
        }
        return operation.calculate(a, b);
    }
}
