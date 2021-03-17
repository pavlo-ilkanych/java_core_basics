package com.company.February.HwFebruary28;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public void SumOfTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

    }
}
