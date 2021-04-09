package com.company.Test;


import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main  {
    public static void main(String[] args) throws MyEx{

        Stream<Person> stream = people().stream();

        int num = 0;
        do{
            System.out.println("1.qwer");
            try {
                num = new Scanner(System.in).nextInt();
            }catch (InputMismatchException e){
                System.err.println("qwrqw");
            }
            switch (num){
                case 1: {
                    stream.sorted((o1,o2) -> -o1.getName().compareTo(o2.getName())).forEach(System.out::println);
                } case 2: {
                    System.exit(1);
                } default:
                    System.err.println("gergerg");
            }
        }while (num != 0);
    }


    private static List<Person> people() {
        StringBuilder data = new StringBuilder();
        List<Person> people = new ArrayList<>();

        try (Reader reader = new FileReader("C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Test\\Test.txt")) {
            while (reader.ready()) {
                data.append((char) reader.read());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (String line : data.toString().split("\n")) {
            String[] elem = line.split(",");
            Person person = new Person(elem[0], elem[1].trim(), Integer.parseInt(elem[2].trim()), elem[3].trim());
            people.add(person);
        }
        return people;
    }
}
