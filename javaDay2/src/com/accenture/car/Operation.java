package com.accenture.car;

class Calculator{
	 // Addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int divide(int a, int b, int c) {
        if (b == 0 || c == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b / c;
    }
}

public class Operation {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	 // Addition
    System.out.println("Addition:");
    System.out.println(calc.add(10, 20)); // int addition
    System.out.println(calc.add(10.5, 20.3)); // double addition
    System.out.println(calc.add(10, 20, 30)); // three int addition

    // Subtraction
    System.out.println("Subtraction:");
    System.out.println(calc.subtract(10, 20)); // int subtraction
    System.out.println(calc.subtract(10.5, 20.3)); // double subtraction
    System.out.println(calc.subtract(10, 20, 30)); // three int subtraction

    // Multiplication
    System.out.println("Multiplication:");
    System.out.println(calc.multiply(10, 20)); // int multiplication
    System.out.println(calc.multiply(10.5, 20.3)); // double multiplication
    System.out.println(calc.multiply(10, 20, 30)); // three int multiplication

    // Division
    System.out.println("Division:");
    System.out.println(calc.divide(10, 20)); // int division
    System.out.println(calc.divide(10.6, 20.3)); // double division
    System.out.println(calc.divide(10, 20, 30)); // three int division

	
}
}
