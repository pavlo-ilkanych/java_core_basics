package com.company.Hw27March;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Methods methods = new Methods();
        Employee employee = new Employee("Jack", 123456, 1000);

        methods.serialize(employee);
        methods.deserialize(employee);
    }
}
