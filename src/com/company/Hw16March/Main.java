package com.company.Hw16March;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog", "Darsie"));
        animals.add(new Animal("cat", "Snowflake"));

        Person john = new Person("John", 30);

        Map<Person, List<Animal>> zooClub = new HashMap<>();
        zooClub.put(john, animals);

        int num;
        do{
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1: Add person");
            System.out.println("2: Add animal to person");
            System.out.println("3: Remove animal from person");
            System.out.println("4: Remove person");
            System.out.println("5: Print map");
            System.out.println("6: Exit");

            num = scanner.nextInt();

            switch (num) {
                case 1 -> {
                    Person newPerson = createNewPerson();
                    List<Animal> list = new ArrayList<>();
                    list.add(createNewAnimal());
                    zooClub.put(newPerson, list);
                    printMap(zooClub);
                }
                case 2 -> {
                    printMap(zooClub);
                    System.out.println("Enter name and age of person");
                    List<Animal> list = zooClub.get(new Person(scanner.next(), scanner.nextInt()));
                    list.add(createNewAnimal());
                    printMap(zooClub);
                }
                case 3 -> {
                    printMap(zooClub);
                    System.out.println("Enter name and age of person");
                    List<Animal> list = zooClub.get(new Person(scanner.next(), scanner.nextInt()));
                    System.out.println("Enter type and name of animal");
                    list.remove(new Animal(scanner.next(), scanner.next()));
                    printMap(zooClub);
                }
                case 4 -> {
                    printMap(zooClub);
                    System.out.println("Enter name and age of person to remove");
                    zooClub.remove(new Person(scanner.next(), scanner.nextInt()));
                    printMap(zooClub);
                }
                case 5 -> {
                    printMap(zooClub);
                }
                case 6 -> {
                    System.exit(0);
                }
                default -> {
                    System.err.println("Incorrect number, please enter from 1 to 6.");
                }
            }

        }while(num != 0);

    }

    private static Person createNewPerson(){
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person name");
        person.setName(scanner.next());

        System.out.println("Enter person age");
        person.setAge(scanner.nextInt());

        return  person;
    }

    private static Animal createNewAnimal(){
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter animal type");
        animal.setAnimalType(scanner.next());

        System.out.println("Enter animal name");
        animal.setAnimalName(scanner.next());

        return animal;
    }

    private static void printMap(Map<Person, List<Animal>> zooClub){
        for(Map.Entry<Person, List<Animal>> zooC : zooClub.entrySet()){
            System.out.println("Key = " + zooC.getKey() + " / Value = " + zooC.getValue());
        }
    }
}
