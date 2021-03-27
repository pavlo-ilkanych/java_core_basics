package com.company.Hw27March;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Methods methods = new Methods();
        Employee employee = new Employee("Jack", 123456, 1000);

//        methods.serialize(employee);
//        methods.deserialize(employee);

        Collection<Employee> collection = new ArrayList<>(); //Task 3

        collection.add(employee);
        collection.add(new Employee("John", 147258, 1500));

        methods.serialize(collection);
        methods.deserialize(collection);
    }
}
