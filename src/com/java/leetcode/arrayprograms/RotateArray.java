package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] nums1 = {-1,-100,3,99};
        int k = 2;
        new RotateArray().rotate(nums1, k);
    }
    public void rotate(int[] nums, int k) {
        int i = 0;
        int j = nums.length-k-1;
        while(i<j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

        i = nums.length-k;
        j = nums.length-1;
        while(i<j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

        i = 0;
        j = nums.length-1;
        while(i<j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
