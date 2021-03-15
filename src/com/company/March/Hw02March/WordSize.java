package com.company.March.Hw02March;

import java.util.Arrays;
import java.util.Scanner;

public class WordSize {

    public void wordSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        String words = scanner.nextLine();

        String[] word = words.split(" ");
        String longestWord = "";
        String shortestWord = word[0];
        for(String a : word){
            if (a.length() > longestWord.length()) {
                longestWord = a;
            }
            if(a.length() < shortestWord.length()){
                shortestWord = a;
            }
        }
        System.out.println("Longest word is: " + longestWord);
        System.out.println("Index: " + Arrays.asList(word).indexOf(longestWord));

        System.out.println("Shortest word is: " + shortestWord);
        System.out.println("Index: " + Arrays.asList(word).indexOf(shortestWord));
    }

    public void wordStartingWithA(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        String words = scanner.nextLine();

        String[] word = words.split(" ");
        String wordA;
        for (int i = 0; i<word.length; i++){
            if(word[i].startsWith("a") && word[i].length()%2 == 0){
                System.out.println(word[i]);
            }
        }
    }


}
