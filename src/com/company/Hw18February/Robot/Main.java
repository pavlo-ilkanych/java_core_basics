package com.company.Hw18February.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();

        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();

        System.out.println();

        Robot[] arr = new Robot[4];
        arr[0] = robot;
        arr[1] = coffeeRobot;
        arr[2] = robotDancer;
        arr[3] = robotDancer;

        for (int i = 0; i < arr.length; i++){
            arr[i].work();
        }
    }
}
