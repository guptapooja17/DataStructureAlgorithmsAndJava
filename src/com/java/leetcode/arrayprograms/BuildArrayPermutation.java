package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        int[] num = {1,3,5,5,7,2,4,6,5};            // all the numbers are <= array indexes
        int[] num1 = {1,3,5,5,7,12,11,4,10};        // won't work with any method as the numbers > array indexes

        int[] ans = new BuildArrayPermutation().buildArray(num);
        System.out.println(Arrays.toString(ans));


        int[] ans1 = new BuildArrayPermutation().buildArray1(num);
        System.out.println(Arrays.toString(ans1));

        int[] ans2 = new BuildArrayPermutation().buildArray2(num);
        System.out.println(Arrays.toString(ans2));

    }

    // Below method won't work with numbers > the array indexes.
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }

    // Below method won't work with numbers > the array indexes.
    public int[] buildArray1(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; ++i)
            nums[i] = (nums[nums[i]] % n) * n + nums[i];

        for(int i = 0; i < n; ++i)
            nums[i] = nums[i] / n;

        return nums;
    }

    // Below method won't work with numbers > the array indexes.
    public int[] buildArray2(int[] nums) {
        int mask = 1023; // Decimal value of the binary number '1111111111'
        for(int i = 0; i < nums.length; i++)
            nums[i] |= (nums[nums[i]] & mask) << 10;
        for(int i = 0; i < nums.length; i++)
            nums[i] = nums[i] >> 10;
        return nums;
    }
}
