package com.java.dsa.binarysearch;

// https://leetcode.com/problems/split-array-largest-sum/description/
// https://www.geeksforgeeks.org/allocate-minimum-number-pages/

public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int[] pages = {12, 34, 67, 90};
        int k = 2;
        System.out.println( new SplitArraySum().splitArray(pages,k));
    }
    public int splitArray(int[] nums, int k) {
        int start = 0 , end = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        // binary search
        while ( start < end) {
            //try for middle as potential ans
            int mid = start + (end-start) / 2;

            // calculate how many pieces you can divide nums array in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num: nums) {
                if ( sum + num > mid) {
                    // you cannot add this num in subarray, make new one
                    // say you add this num in subarray, new sum = num itself
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}
