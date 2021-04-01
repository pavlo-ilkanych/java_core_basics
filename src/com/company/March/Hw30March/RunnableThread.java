package com.company.March.Hw30March;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnableThread implements Runnable{
    private int number;
    private long timeout = 1000; //Тут затримку вказуємо прямо в полі.


    @Override
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much number you want to see?");

        try {
            this.number = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Enter number please!");
        }

        //В цьому методі числа виводяться не від 0, а від 1. Тобто 1 1 2 3...
        int[] arr = new int[number];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
