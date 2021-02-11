package com.company;

import java.util.Scanner;

class Hw10February {
    public static void main(String[] args) {
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