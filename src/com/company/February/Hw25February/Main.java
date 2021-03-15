package com.company.February.Hw25February;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        String word;

        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1: Check if there is such a month");
            System.out.println("2: Display all months with the same time of year");
            System.out.println("3: Display all months who have the same number of days.");
            System.out.println("4: Display all months with fewer days.");
            System.out.println("5: Display the next season.");
            System.out.println("6: Display all month who have even numbers of days");
            System.out.println("7: Display if that month have even numbers of days");
            num = scan.nextInt();

            System.out.println("Write month to check");
            word = scan.next().toUpperCase(Locale.ROOT);

            switch (num) {
                case 1: {
                    for (Months month : Months.values()) {
                        if (word.equals(month.name()))
                            System.out.println(word + " it's a month.");
                        else return;
                    }
                    break;
                }
                case 2: {
                    for (Months month : Months.values()) {
                        if (word.equals(month.name())) {
                            System.out.println(month.getSeason() + " has: ");
                            for (Months month1 : Months.values()){
                                if (month.getSeason().equals(month1.getSeason())) {
                                    System.out.println(month1);
                                }
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    for (Months month : Months.values()) {
                        if (word.equals(month.name())) {
                            System.out.println("All months who have the same number of days: ");
                            for (Months month1 : Months.values()) {
                                if(month.getDays() == month1.getDays()){
                                    System.out.println(month1);
                                }
                            }
                        }
                    }
                    break;
                }
                case 4:{
                    for (Months month : Months.values()) {
                        if (word.equals(month.name())) {
                            System.out.println("All months with fewer days: ");
                            for (Months month1 : Months.values()) {
                                if (month.getDays() > month1.getDays()){
                                    System.out.println(month1);
                                }
                            }
                        }
                    }
                    break;
                }
                case 5:{
                    for (Months month : Months.values()) {
                        if (word.equals(month.name())) {
                            System.out.println("The next season: ");
                            for (Months month1: Months.values()) {
                                if(month.getSeason().ordinal() == month1.getSeason().ordinal()){
                                    System.out.println(month1.getSeason().ordinal());
                                }
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("All month who have even numbers od days: ");
                    for (Months month : Months.values()) {
                        if (month.getDays()%2 == 0) {
                            System.out.println(month.name());
                        }
                    }
                    break;
                }
                case 7:{
                    for (Months month : Months.values()) {
                        if (word.equals(month.name())) {
                            if (month.getDays() % 2 == 0) {
                                System.out.println("Yes");
                            } else
                                System.out.println("No");
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("This is not a menu item, try again.");
                    return;
                }
            }
        } while (num != 0);
    }
}