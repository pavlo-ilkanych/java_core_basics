package com.company.Hw27March;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Methods methods = new Methods();
        Employee employee = new Employee("Jack", 123456, new Salary(1000));

        methods.serialize(employee, "C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");
        methods.deserialize("C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");

        Collection<Employee> collection = new ArrayList<>();

        collection.add(employee);
        collection.add(new Employee("John", 147258, new Salary(1500)));

        methods.serialize(collection, "C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");
        methods.deserialize("C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");
    }
}
