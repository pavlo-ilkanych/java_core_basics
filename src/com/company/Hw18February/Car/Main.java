package com.company.Hw18February.Car;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("gas", 2018,
                          new Wheel(21, "winter", "titan"),
                          new SteeringWheel(35,"skin", true),
                          new CarBody("jeep", "grey", 14785));
        car.setSummerTires();
        System.out.println(car.getTires());
    }
}