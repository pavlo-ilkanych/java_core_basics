package com.company;

import java.util.Scanner;

public class Hw10February {
    // Task 1
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        int n;
        int k;
        double vklad;

        System.out.println("Введіть суму: ");
        m = sc.nextInt();

        System.out.println("Під який відсоток?: ");
        n = sc.nextInt();

        System.out.println("На скільки років?: ");
        k = sc.nextInt();

        vklad = m * (k/n);
        System.out.println("Ваш вклад становитиме " + vklad + " гривень.");
    }
}

//Task 2
static class Arr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Введыть елементи масиву: ");
        for (int a = 0; a < arr.length; a++) {
            arr[a] = sc.nextInt();
        }

        System.out.print("Ваш массив:");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(" " + arr[a]);
        }

        System.out.println();

        System.out.println("Елементи у зворотньому порядку: ");
        for (int a = arr.length - 1; a >= 0; a--) {
            System.out.print(" " + arr[a]);
            }
        }
    }*/

//Task 3
//static class DeepArr1 {
    public static void main(String[] args) {
        int [][] deepArr = new int[5][7];
        for (int a = 0; a < deepArr.length; a++) {
            for (int b = 0; b < deepArr[a].length; b++){
                deepArr [a][b] = ((int)(Math.random() * 78) - 2);
                System.out.print(deepArr[a][b] + "\t");
                }
            System.out.println();
            }
        }
    }


