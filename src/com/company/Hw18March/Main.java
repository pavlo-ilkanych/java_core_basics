package com.company.Hw18March;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Person p = new Person("John");
        Class<Person> personClass = Person.class;

        //Отримати всі методи
        Method[] methods = personClass.getDeclaredMethods();
        System.out.println("Get methods");
        for(Method method : methods){
            System.out.println(method);
        }

        //Отримати поля класу
        Field[] fields = personClass.getDeclaredFields();
        System.out.println("Get fields");
        for(Field field : fields){
            System.out.println(field);
        }

        //Отримати всі конструктори
        Constructor[] constructors = personClass.getDeclaredConstructors();
        System.out.println("Get constructor");
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

        //Створити екземпляр класу
        Person person = (Person) constructors[0].newInstance("name1");
        Person person1 = (Person) constructors[1].newInstance(35);
        System.out.println(person.toString());
        System.out.println(person1.toString());

        //Викликати 2 методи
        Method setName = personClass.getDeclaredMethod("setName", String.class);
        setName.setAccessible(true);
        setName.invoke(p, "Paul");
        System.out.println(p.getName());

        Method getName = personClass.getMethod("getName");
        System.out.println(getName.invoke(p));
    }
}