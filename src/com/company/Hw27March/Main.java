package com.company.Hw27March;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt";
        Employee employee = new Employee("Jack", 123456, new Salary(1000));

        Methods.serialize(employee, path);
        Employee employeeRestored = Methods.deserialize(path);

        System.out.println(employeeRestored);

        Collection<Employee> collection = new ArrayList<>();

        collection.add(employee);
        collection.add(new Employee("John", 147258, new Salary(1500)));

        Methods.serialize(collection, path);
        Collection<Employee> collectionRestored = Methods.deserialize(path);
        System.out.println(collectionRestored);
    }
}
