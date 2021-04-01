package com.company.March.Hw30March;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyThread extends Thread{

    private int number;
    private long timeout;

    //Затримку можна було визначати багатьма способами, я вирішив зробити через конструктор.
    public MyThread(long timeout) {
        this.timeout = timeout;
    }

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

        //В цьому методі числа виводяться  від 0. Тобто 0 1 1 2 3...
        int[] arr = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int j : arr) {
            System.out.println(j);

            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
