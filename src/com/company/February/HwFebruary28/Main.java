package com.company.February.HwFebruary28;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws MyException {
        CheckNumber checkNumber = new CheckNumber();
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        Methods methods = new Methods();


        try {

            methods.addition(5, 5);
            methods.division(-5, -5);
            methods.subtraction(5, 0);
            methods.multiplication(0, 0);

        }catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e){
            e.printStackTrace();
        }


        try {
        checkNumber.CheckNumber();
        }catch (InputMismatchException e){
            System.err.println("Enter only integer!");
        }

        try {
           sumOfTwoNumbers.SumOfTwoNumbers();
        }catch (InputMismatchException e){
           System.err.println("Enter only integer!");
        }
    }
}

