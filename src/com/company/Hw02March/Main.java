package com.company.Hw02March;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        str = "I like Java !!!";

        System.out.println(str.charAt(str.length() -1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.compareTo("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("J"), str.lastIndexOf(" ")));

        WordSize size = new WordSize();
        size.wordSize();
        size.wordStartingWithA();

    }
}
