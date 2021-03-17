package com.company.March.Hw13March;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SomeClass smt1 = new SomeClass("smt1", 1);
        SomeClass smt2 = new SomeClass("smt2", 2);
        SomeClass smt3 = new SomeClass("smt3", 3);
        SomeClass smt4 = new SomeClass("smt4", 4);

        Set<SomeClass> set = new HashSet<>();
        set.add(smt1);
        set.add(smt2);
        set.add(smt3);
        set.add(smt4);


        System.out.println("Unsorted list by HashSet");
        for (SomeClass a : set) {
            System.out.println(a + " " + a.hashCode());
        }

        Set<SomeClass> set1 = new TreeSet<>(set);

        System.out.println("Sorted list");
        for (SomeClass a : set1) {
            System.out.println(a + " " + a.hashCode());
        }

        Set<SomeClass> set2 = new LinkedHashSet<>(set);

        System.out.println("Unsorted list by Linked HashSet");
        for (SomeClass a : set2) {
            System.out.println(a);
        }

    }
}
