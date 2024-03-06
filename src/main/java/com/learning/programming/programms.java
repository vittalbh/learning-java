package com.learning.programming;

import java.util.*;

class TwoSum {

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                System.out.println(nums[numMap.get(complement)] + " " + nums[i]);
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    // Time complexity: O(n)
    private static List<Integer[]> findTwoSumUsingSet(int[] nums, int target) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numSet.contains(complement)) {
                System.out.println(complement + " " + nums[i]);
                result.add(new Integer[]{complement, nums[i]});
            } else {
                numSet.add(nums[i]);
            }
        }
        return result;
    }

    // Time complexity: O(n*log(n))
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        List<Integer[]> result = new ArrayList<>();
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                System.out.println(nums[left] + " " + nums[right]);
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] integers = {2, 7, 11, 15, -2};
        //findTwoSum(integers, 9);
        //findTwoSumUsingSet(integers, 9);
        findTwoSum_Sorting(integers, 9);

    }
}
