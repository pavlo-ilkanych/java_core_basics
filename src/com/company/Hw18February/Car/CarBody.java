package com.company.Hw18February.Car;

public class CarBody {

    private String type;
    private String color;
    private int series;

    public CarBody(String type, String color, int series) {
        this.type = type;
        this.color = color;
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getChangeColor(String color){
        return "black";
    }
}
