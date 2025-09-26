package com.nicksimfromthej.calculator;


public class Calculator {
    private double[] a;
    Calculator(double[] a) {
        this.a = a;
    }

    public double[] getA() {
        return a;
    }

    public double add() {
        double sum = 0;
        for (double num : a) {
            sum += num;
        }
        return sum;
    }

    public double subtract() {
        if (a.length == 0) return 0;
        double result = a[0];
        for (int i = 1; i < a.length; i++) {
            result -= a[i];
        }
        return result;
    }
}