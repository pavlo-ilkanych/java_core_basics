package com.company.HwFebruary28;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws MyException {
        CheckNumber checkNumber = new CheckNumber();
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        Methods methods = new Methods();

        methods.setA(5);
        methods.setB(5);


//
//       try {
//        checkNumber.CheckNumber();
//        }catch (InputMismatchException e){
//        System.err.println("Enter only integer!");
//       }
//
//       try {
//           sumOfTwoNumbers.SumOfTwoNumbers();
//       }catch (InputMismatchException e){
//           System.err.println("Enter only integer!");
//       }
    }
}

