package com.learning.strings;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();

        System.out.println("Is \"" + palindrome + "\" Pallindrome ?  " + isPallindrome("palindromenilap"));

        //palindrome.getChars(0, len, tempCharArray, 0);
        String str1 = "Now is the time for all good ";
        String str2 = "men to come to the aid of their country";
        str1 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(str2);
    }

    static boolean isPallindrome(String palindrome) {
        int len = palindrome.length();
        char[] tempCharArray = palindrome.toLowerCase().toCharArray();
        for (int i = 0; i < len / 2; i++) {
            if (tempCharArray[i] != tempCharArray[len - i - 1]) {
                System.out.println("exited at " + i);
                return false;
            }
        }
        return true;
    }
}
