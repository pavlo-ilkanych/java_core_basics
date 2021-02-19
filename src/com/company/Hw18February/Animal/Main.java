package com.company.Hw18February.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Leopard", 70, 10);
        System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років.");
        System.out.println();
        animal.setName("Bull");
        animal.setSpeed(2);
        animal.setAge(14);
        System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років.");
    }
}
