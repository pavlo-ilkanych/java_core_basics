package com.company.March.Hw27March;

import java.io.Serializable;

public class Salary implements Serializable {

    private int salary;

    public Salary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
