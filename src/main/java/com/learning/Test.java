package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        testStreams();

        String str1 = new String("abc");
        System.out.println(str1);

        String str2 = str1;

        String str3 = "abc";

        System.out.println(str2);
        //System.out.println(str1 == str2);

        str2 = "def";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }



    static void testStreams() {
        List<University> universities = new ArrayList<>();
        universities.add(new University("Unviersity1"));
        universities.add(new University("Unviersity2"));
        universities.add(new University("Unviersity3"));
        universities.add(new University("Unviersity4"));
        universities.add(new University("Unviersity5"));
        universities.add(new University("Unviersity6"));
        universities.add(new University("Unviersity7"));
        universities.add(new University("Unviersity8"));
        universities.add(new University("Unviersity9"));
        universities.add(new University("Unviersity10"));

        //List<String> names = universities.stream().flatMap(university -> university.getName()).collect(Collectors.toList());
         //       flatMap(University::getName).toList();

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())  // Flattening step
                .toList();

        //Prints [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Flattened list: " + flattenedList);

        List<String> names = universities.stream().map(University::getName).filter(name -> name.length() > 10).map(String::toUpperCase).toList();

        System.out.println("names list: " + names);

    }
}

class University {

    private String id;
    private String name;

    University(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
