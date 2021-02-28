package com.company.Hw23February;

public class MyCalculator implements Numerable{

    private double a;
    private double b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double division() {
        double div = a / b;
        return div;
    }

    @Override
    public double subtraction() {
        double sub = a - b;
        return sub;
    }

    @Override
    public double multiplication() {
        double multi = a * b;
        return multi;
    }

    @Override
    public double addition() {
        double add = a + b;
        return add;
    }
}
