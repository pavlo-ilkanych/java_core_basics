package com.company.Hw04March;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public void findWordsWithA(){
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("^a");
        for(int i = 0; i < 10; i++){
            String word = scanner.next();
            Matcher  matcher = pattern.matcher(word);

            if(matcher.find()){
                words.add(word);
            }
        }
        System.out.println("In list");
        for(String a : words){
            System.out.println(a);
        }
    }

    public void validationEmail(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        List<String> inputEmail = new ArrayList<>();
        String email = scanner.next();
        inputEmail.add(email);

        List<String> emails = new ArrayList<>();

        Pattern pattern = Pattern.compile("@gmail.com$");
        for (int i = 0; i < inputEmail.size(); i++) {
            String email1 = email;
            Matcher matcher = pattern.matcher(email1);

            if(matcher.find()){
                emails.add(email1);
            }
        }
        System.out.println();
        for (String e : emails){
            System.out.println(e);
        }
    }


}
