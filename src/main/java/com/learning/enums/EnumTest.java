package com.learning.enums;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Color color = Color.RED;

        System.out.println("Color Name: " + color.name());
        System.out.println("Color Value: " + color.getValue());

        Arrays.stream(Color.values()).forEach(color1 -> System.out.println(color1.name() + " : " + color1.getValue()));
    }
}
