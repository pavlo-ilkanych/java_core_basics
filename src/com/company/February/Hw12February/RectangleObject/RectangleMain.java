package com.company.February.Hw12February.RectangleObject;


public class RectangleMain {
    public static void main(String[] args) {
        Rectangle standRectangle = new Rectangle();
        Rectangle rectangle = new Rectangle(50, 100);

        System.out.println("Площа прямокутника = " + rectangle.area());
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
    }
}
