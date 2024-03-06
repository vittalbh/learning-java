package com.learning.enums;

public enum Color {
    RED("red"), BLUE("blue"), GREEN("green");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
