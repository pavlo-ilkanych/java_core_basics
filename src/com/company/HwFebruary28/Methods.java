package com.company.HwFebruary28;

public class Methods {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) throws MyException {
            if (a > 0) {
                throw new MyException("Wrong!");
            }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double division() {
        double div = a / b;
        return div;
    }

    public double subtraction() {
        double sub = a - b;
        return sub;
    }

    public double multiplication() {
        double multi = a * b;
        return multi;
    }

    public double addition() {
        double add = a + b;
        return add;
    }
}
