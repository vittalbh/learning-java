package com.learning.strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        checkForAnagram("Ananas", "nasana");

    }

    static void checkForAnagram(String str1, String str2) {

        //[A,n,a,n,a,s]
        //[n,a,s,a,n,a]
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println("String are not Anagram");
        }
    }
}
