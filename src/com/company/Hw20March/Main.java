package com.company.Hw20March;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MyEntry<String,Integer> myEntry = new MyEntry<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("gfdgdf", 1);

        myEntry.addObject(map, "John", 30);
        myEntry.addObject(map, "Jack", 20);
        myEntry.remove(map, "Jack");
        myEntry.removeByValue(map, 30);
        myEntry.printKeys(map);
        myEntry.printValues(map);
        myEntry.printMap(map);
    }
}
