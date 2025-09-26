package com.nicksimfromthej.calculator;



public class Main {
    public static void main(String[] args) {
        double[] numbers = {10, 2, 5};
        Calculator calc = new Calculator(numbers);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());

        MultiplicationCalculator multCalc = new MultiplicationCalculator(numbers);
        System.out.println("Multiplication: " + multCalc.multiply());
        System.out.println("Division: " + multCalc.divide());
    }
}