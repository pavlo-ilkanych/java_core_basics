package com.company.February.Hw18February.Car;

public class Wheel {

    private int radius;
    private String protector;
    private String typeOfMetal;

    public Wheel(int radius, String protector, String typeOfMetal) {
        this.radius = radius;
        this.protector = protector;
        this.typeOfMetal = typeOfMetal;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getProtector() {
        return protector;
    }

    public void setProtector(String protector) {
        this.protector = protector;
    }

    public String getTypeOfMetal() {
        return typeOfMetal;
    }

    public void setTypeOfMetal(String typeOfMetal) {
        this.typeOfMetal = typeOfMetal;
    }

    public double getChangeRadius(int radius){
        return radius * 2;
    }
}
