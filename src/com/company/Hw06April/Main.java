package com.company.Hw06April;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<People> peoples = new ArrayList<>();
        peoples.add(new People("John", 20, "Male"));
        peoples.add(new People("Jack", 25, "Male"));
        peoples.add(new People("Den", 70, "Male"));
        peoples.add(new People("Sara", 45, "Female"));
        peoples.add(new People("Lora", 15, "Female"));
        peoples.add(new People("Kate", 57, "Female"));

        //Вибрати чоловіків-військовозoбов'язаних (від 18 до 27 років)
        peoples.stream()
                .filter(people -> people.getAge() >= 18 && people.getAge() < 27 && people.getSex().equalsIgnoreCase("male"))
                .forEach(System.out::println);
        //Знайти середній вік серед чоловіків
        peoples.stream()
                .filter(people -> people.getSex().equalsIgnoreCase("male"))
                .mapToInt(People::getAge).average()
                .getAsDouble();
        //Знайти кількість потенційно працездатних людей у вибірці (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60)
        peoples.stream()
                .filter(people -> people.getAge() >= 18)
                .filter(people -> (people.getSex().equalsIgnoreCase("male") && people.getAge() < 60) || (people.getSex().equalsIgnoreCase("female") && people.getAge() < 55))
                .count();
        //Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        peoples.stream()
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList());
        //Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        peoples.stream()
                .sorted((o1, o2) -> o1.getName() != o2.getName() ? o1.getName().compareTo(o2.getName()): o1.getAge().compareTo(o2.getAge()))
                .collect(Collectors.toList());
        //Знайти найстаршу людину
        peoples.stream().max((o1, o2) -> o1.getAge().compareTo(o2.getAge())).get();
        //Знайти наймолодшу людину
        peoples.stream().min((o1, o2) -> o1.getAge().compareTo(o2.getAge())).get();
        //Вивести скільки є чоловіків
        peoples.stream()
                .filter(people -> people.getSex().equalsIgnoreCase("male"))
                .count();
        //Вивести скільки є жінок
        peoples.stream()
                .filter(people -> people.getSex().equalsIgnoreCase("female"))
                .count();
        //Вивести всіх жінок в яких ім’я починається на “A”
        peoples.stream()
                .filter(people -> people.getSex().equalsIgnoreCase("female") && people.getName().startsWith("S"))
                .count();
    }
}
