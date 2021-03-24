package com.company.Hw20March;

import java.util.Map;

public class MyEntry <K, V>{

    private K name;
    private V age;

    public MyEntry() {
    }

    public MyEntry(K name, V age) {
        this.name = name;
        this.age = age;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public void addObject(Map<K, V> map, K name, V age){
        map.put(name, age);
    }

    public void remove(Map<K, V> map, K name){
        map.remove(name);
    }

    public void removeByValue(Map<K, V> map, V age){
        if(map.containsValue(age)){
            for(Map.Entry<K,V> entry : map.entrySet()){
                if (entry.getValue().equals(age)){
                    map.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    public void printKeys(Map<K,V> map){
        for (K name : map.keySet()){
            System.out.println(name);
        }
    }

    public void printValues(Map<K,V> map){
        for (V age : map.values()){
            System.out.println(age);
        }
    }

    public void printMap(Map<K, V> map){
        for(Map.Entry<K,V> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + " / Value = " + entry.getValue());
        }
    }
}
