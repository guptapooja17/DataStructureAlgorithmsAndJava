package com.java.dsa.binarysearch;

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = new FirstLastIndex().searchRange(nums,target);
        System.out.println("Result is :   " + Arrays.toString(res));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        // check for first index
        ans[0] = search(nums,target,true);
        if (ans[0]!= -1) {
            //check for last index
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    // this function returns the index value of target
    int search(int[] nums, int target, boolean findsStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential answer many be found
                ans = mid;
                if (findsStartIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
