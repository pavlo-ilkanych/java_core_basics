package com.company.Hw12February.CircleObject;

public class Circle {
    private double diameter;
    private double radius;

    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return diameter * Math.PI;
    }
}
