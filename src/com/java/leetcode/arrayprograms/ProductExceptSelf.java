package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[] ans = new ProductExceptSelf().productExceptSelf1(num);
        System.out.println(Arrays.toString(ans));
    }

    // Brute force
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int mul = 1;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            mul = 1;
            while (j < nums.length) {
                if (i != j) {
                    mul *= nums[j];
                }
                ans[i] = mul;
                j++;
            }
        }
        return ans;
    }

    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
            System.out.println("pre[i - 1] :  " + pre[i - 1] + "  nums[i - 1]  : " + nums[i - 1]);
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
            System.out.println("suff[i + 1] :  " + suff[i + 1] + "  nums[i + 1]  : " + nums[i + 1]);

        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    // https://leetcode.com/problems/product-of-array-except-self/solutions/1342916/3-minute-read-mimicking-an-interview/
}
