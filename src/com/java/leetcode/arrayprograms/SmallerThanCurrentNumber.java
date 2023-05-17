package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new SmallerThanCurrentNumber().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            count = 0;
            count += Arrays.stream(nums).filter(j -> j < curr).count();
            System.out.println("ccc " + count);
            ans[i] = count;
        }
        return ans;
    }
}
