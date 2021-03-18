package com.company.February.Hw12February.RectangleObject;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
        this.width = 5;
        this.length = 10;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return (2 * width) + (2 * length);
    }
}
