package com.learning;

import java.util.*;
import java.util.stream.Collectors;

// Single-field Comparable with object reference field  (Page 69)
public final class CaseInsensitiveString
        implements Comparable<CaseInsensitiveString> {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // Fixed equals method (Page 40)
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return s;
    }

    // Using an existing comparator to make a class comparable
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }

    public static void main(String[] args) {
        Set<CaseInsensitiveString> s = new TreeSet<>();
        List<String> strings = new ArrayList<>();
        Set<String> s1 = new TreeSet<>();
        strings.add("Using");
        strings.add("an");
        strings.add("existing");
        strings.add("comparator");
        strings.add("comparable");
        strings.stream().map(str -> s1.add(str)).collect(Collectors.toSet());

        for (String arg : strings)
            s.add(new CaseInsensitiveString(arg));
        System.out.println(s);
        System.out.println(s1);
    }
}