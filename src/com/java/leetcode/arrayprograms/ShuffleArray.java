package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] ans = new ShuffleArray().shuffle(nums, 3);
        System.out.println(Arrays.toString(ans));
    }
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[nums.length];

        for (int i = 0, s = 0, e = n; s < n; s++,e++) {
            temp[i] = nums[s];
            temp[i+1] = nums[e];
            i+=2;       // temp index
        }
        return temp;
    }
}
