package com.company.Hw12February.CircleObject;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть радіус: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Площа: " + circle.getArea());
        System.out.println("Довжина: " + circle.getLength());

    }
}
