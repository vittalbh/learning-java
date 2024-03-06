package com.learning.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        Integer integerWrapper = Integer.valueOf(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(integerWrapper);
        System.out.println("absolute value of " + integerWrapper + " = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);    // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = ld.get(0);
        System.out.println("pi = " + pi);

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 1)
            li.add(i); //li.add(Integer.valueOf(i));

        System.out.println("sumEven = " + sumEven(li));
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }

    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0) //if (i.intValue() % 2 == 0)
                //sum += i.intValue();
                sum += i;
        return sum;
    }
}
