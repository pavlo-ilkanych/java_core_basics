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

    public void validationEmail() {
        Scanner scanner = new Scanner(System.in);

        List<String> emails = new ArrayList<>();

        System.out.println("Enter your email address: ");
        String stop = "q";
        // To stop the loop enter q.
        while (true) {
            String email = scanner.next();
            Pattern pattern = Pattern.compile("@gmail.com$");
            Matcher matcher = pattern.matcher(email);

            if(email.equals(stop)) {
                break;
            } else if (matcher.find()) {
                emails.add(email);
            } else {
                System.out.println("Incorrect email");
            }
        }
        System.out.println("In list");
        for (String a : emails) {
            System.out.println(a);
        }
    }

}
