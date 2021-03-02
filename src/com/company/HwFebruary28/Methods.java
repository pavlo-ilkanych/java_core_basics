package com.company.HwFebruary28;

public class Methods {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double division(double a, double b) throws IllegalArgumentException {
        if (a < 0 && b < 0){
            throw new IllegalArgumentException("Wrong!");
        }
        double div = a / b;
        return div;
    }

    public double subtraction(double a, double b) throws ArithmeticException{
        if(a == 0 && b!= 0 || a!=0 && b == 0){
            throw new ArithmeticException("Wrong!");
        }
        double sub = a - b;
        return sub;
    }

    public double multiplication(double a, double b) throws  IllegalAccessException{
        if(a == 0 && b == 0){
            throw new IllegalAccessException("Wrong!");
        }
        double multi = a * b;
        return multi;
    }

    public double addition(double a, double b) throws MyException {
        if (a > 0 && b > 0) {
            throw new MyException("Wrong!");
        }
        double add = a + b;
        return add;
    }
}
