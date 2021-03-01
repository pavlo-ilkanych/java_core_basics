package com.company.HwFebruary28;

import java.util.Scanner;

public class CheckNumber {

    Scanner scanner = new Scanner(System.in);

    public void CheckNumber(){
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is even.");
        } else
            System.out.println("Your number is odd.");
    }
}
