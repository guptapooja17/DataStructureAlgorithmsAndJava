package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        ConcatenationOfArray obj = new ConcatenationOfArray();
        int[] num = {1,2,3,4};
        int[] con = obj.getConcatenation(num);
        System.out.println(Arrays.toString(con));
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length* 2];
        for (int index = 0; index < nums.length; index++) {
            ans[index] = ans[nums.length + index] = nums[index];
            //ans[nums.length + index] = nums[index];
        }
        return ans;
    }
}
