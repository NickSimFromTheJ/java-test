package com.nicksimfromthej.calculator;

public class MultiplicationCalculator extends Calculator {
    MultiplicationCalculator(double[] a) {
        super(a);
    }

    public double multiply() {
        if (getA().length == 0) return 0;
        double product = 1;
        for (double num : getA()) {
            product *= num;
        }
        return product;
    }

    public double divide() {
        if (getA().length == 0) return 0;
        double result = getA()[0];
        for (int i = 1; i < getA().length; i++) {
            if (getA()[i] == 0) {
                throw new ArithmeticException("Division by zero");
            }
            result /= getA()[i];
        }
        return result;
    }
}