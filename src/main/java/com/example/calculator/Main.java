package com.example.calculator;

import com.example.calculator.operations.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Configurando las operaciones disponibles
        Map<String, Operation> operations = new HashMap<>();
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());

        // Inyectando las dependencias en la calculadora
        Calculator calculator = new Calculator(operations);

        // Interacción con el usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        // Leer el primer número validando que sea numérico
        double num1 = readNumber(scanner, "Enter first number: ");

        // Operador
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        // Leer el segundo número validando que sea numérico
        double num2 = readNumber(scanner, "Enter second number: ");

        // Cálculo y manejo de posibles excepciones
        try {
            double result = calculator.calculate(operator, num1, num2);
            System.out.println("The result is: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Método auxiliar para validar que la entrada es un número
    private static double readNumber(Scanner scanner, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                break; // Salir del bucle si la entrada es válida
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consumir la entrada inválida
            }
        }
        return number;
    }
}
