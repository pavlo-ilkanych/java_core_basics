package com.company.Hw18February.Car;

public class Car {

    private int year;
    private String typeOfFuel;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private CarBody carBody;

    public Car(String typeOfFuel, int year, Wheel wheel, SteeringWheel steeringWheel, CarBody carBody){
        this.year = year;
        this.typeOfFuel = typeOfFuel;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.carBody = carBody;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void changeCarBody(int year) {
        if (year > 2015) {
            carBody.getChangeColor("blue");
        } else carBody.getChangeColor("black");
    }

}
