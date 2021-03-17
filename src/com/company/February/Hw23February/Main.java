package com.company.February.Hw23February;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(10, 21);
        myCalculator.addition();
        myCalculator.subtraction();
        myCalculator.multiplication();
        myCalculator.division();

        System.out.println("Результати арифметичних операцій. Дані: число а = " + myCalculator.getA() + ", число b = " + myCalculator.getB());
        System.out.println("Додавання: " + myCalculator.addition());
        System.out.println("Віднімання: " + myCalculator.subtraction());
        System.out.println("Множення: " + myCalculator.multiplication());
        System.out.println("Ділення: " + myCalculator.division());
    }
}
