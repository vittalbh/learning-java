package com.learning.programming;

public class SquaresOfSortedArray {
    public static int[] sortedSquaresSimplified(int[] a) {
        int n = a.length;
        int[] squaredArr = new int[n];
        int highestSquareIdx = n - 1;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int leftSquare = a[left] * a[left];
            int rightSquare = a[right] * a[right];

            if (leftSquare > rightSquare) {
                squaredArr[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squaredArr[highestSquareIdx--] = rightSquare;
                right--;
            }
        }

        return squaredArr;
    }

    public static void main(String[] args) {

        int[] a = {-5, -2, -1, 0, 4, 6};

        int[] squaredArray = sortedSquaresSimplified(a);
        for (int i = 0; i < squaredArray.length; i++) {
            System.out.print(squaredArray[i] + " ");
        }
        System.out.println();

        String s = "anagram", t = "nagaram";
        char[] charStr1Array = s.toCharArray();
        char[] charStr2Array = t.toCharArray();
        //charStr1Array.s
        //boolean isAnagram = s.split("").sort().join('') === t.split('').sort().join('') ? true : false
    }
}
