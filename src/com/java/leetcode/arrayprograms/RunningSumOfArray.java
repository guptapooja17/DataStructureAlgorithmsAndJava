package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] ans = new RunningSumOfArray().runningSum1(num);
        System.out.println(Arrays.toString(ans));
    }
    public int[] runningSum(int[] nums) {
        int[] temp = new int[nums.length];
        int start = 0, end = 0 ;
        while (end < nums.length) {
            temp[end] = nums[end] + temp[start];
            if(start < end) {
                start++;
            }
            end++;
        }
        return temp;
    }

    // Optimized solution
    public int[] runningSum1(int[] nums) {
        int start = 1;
        while (start < nums.length) {
            nums[start] = nums[start] + nums[start-1];
            start++;
        }
        return nums;
    }
}
