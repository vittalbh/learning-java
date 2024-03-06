package com.learning.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        String[] strArray = {"java","FindDups","i","came","i","saw","i","left"};
        Set<String> s1 = Arrays.stream(strArray).map(String::toUpperCase).collect(Collectors.toSet());
        //Set<String> distinctWords = new HashSet<>(Arrays.asList(strArray));
        System.out.println(s1.size() + " distinct words: " + s1);

        String[] strArray2 = {"vithal","saw","left"};
        Set<String> s2 = new HashSet<>(Arrays.stream(strArray2).map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println(s2.size() + " distinct words: " + s2);


        Set<String> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(s1.size() + " distinct words: " + s1);

        Set<String> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(s1.size() + " distinct words: " + s1);

        Set<String> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println(s1.size() + " distinct words: " + s1);
    }
}
