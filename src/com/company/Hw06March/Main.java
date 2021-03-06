package com.company.Hw06March;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (!words.contains("break")){
            words.add(scanner.next());
        }



//        printAll(words);
//        printAllStartWithS(words);
//        printAllMoreThanFive(words);
        removeMoreThanFiveElement(words);
//        checkList(words);
    }

    private static void printAll(List<String> words) {
        for (String str : words) {
            System.out.println(str + " ");
        }
        System.out.println();
    }

    private static void printAllStartWithS(List<String> words){
        for (String str : words){
            if(str.startsWith("s")){
                System.out.println(str + " ");
            }
        }
        System.out.println();
    }

    private static void printAllMoreThanFive(List<String> words){
        for (String str : words){
            if(str.length() > 5){
                System.out.println(str + " ");
            }
        }
        System.out.println();
    }

    private static void removeMoreThanFiveElement(List<String> words){
        for (String str : words){
            if(words.size() > 5){
                words.subList(5, words.size()).clear();
                System.out.println(words.toString());
            }
        }
    }

    public static void checkList(List<String> words){
        for (String str : words){
            if(!words.isEmpty()){
                throw new NullPointerException("List is empty!");
            }
        }
    }
}
