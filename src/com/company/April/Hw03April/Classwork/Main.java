package com.company.April.Hw03April.Classwork;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mark", 19));
        people.add(new Person("Tom", 10));
        people.add(new Person("Jack", 49));
        people.add(new Person("Sam", 17));
        people.add(new Person("Max", 29));

        //Task 1
        List<Person> adults = new ArrayList<>();
        people.forEach(person -> {
            if (person.getAge() >= 18) {
                adults.add(person); //Для первірки
            }
        });
        System.out.println(adults);


        //Task 2
        people.forEach(person -> person.setDate(new Date()));
        System.out.println(people.toString()); //Для перевірки


        //Task 3
        List<String> stringList = new ArrayList<>();
        stringList.add("qwerty");
        stringList.add("asdfg");
        stringList.add("zxcv");
        ArrayList<Integer> lengthList = new ArrayList<>();

        stringList.forEach(String -> {
            if(!stringList.isEmpty()){
                lengthList.add(String.length());
            }
        });
        System.out.println(lengthList); //Для перевірки

    }
}
