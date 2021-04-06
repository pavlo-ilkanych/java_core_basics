package com.company.April.Hw03April.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Main {
    public static void main(String[] args)
    {
        FunctionalInterfaceExample sum = ((a, b, c) -> a + b + c ); // Знаходження суми всіх значень.
        System.out.println(sum.value(5, 7, 9));

        FunctionalInterfaceExample average = ((a, b, c) -> //Середнє арифметичне, способів знаходження багато, обрав через масив.
        {
            int[] num = {a, b, c};
            int result = 0;
            for(int i : num)
            {
                result += i;
            }
            return result/num.length;
        });
        System.out.println(average.value(5, 6, 7));

        FunctionalInterfaceExample maxValue = ((a, b, c) -> //Знаходження аксимального значення за допомогою методу колекції.
        {
            Collection<Integer> num = new ArrayList();
            num.add(a);
            num.add(b);
            num.add(c);
            return Collections.max(num);
        });
        System.out.println(maxValue.value(10, 20, 15));
    }
}
