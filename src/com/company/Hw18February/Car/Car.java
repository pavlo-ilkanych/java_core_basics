package com.company.Hw18February.Car;

public class Car {

    private int manufactureYear;
    private String typeOfFuel;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private CarBody carBody;

    public Car(String typeOfFuel, int year, Wheel wheel, SteeringWheel steeringWheel, CarBody carBody){
        this.manufactureYear = year;
        this.typeOfFuel = typeOfFuel;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.carBody = carBody;
    }

    public int getYear() {
        return manufactureYear;
    }

    public void setYear(int year) {
        this.manufactureYear = year;
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

    public void setWinterTires(){
        this.wheel.setProtector("winter");
    }

    public void setSummerTires(){
        this.wheel.setProtector("summer");
    }

    public String getTires(){
        return this.wheel.getProtector();
    }
}
