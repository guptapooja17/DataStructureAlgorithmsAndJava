package com.java.dsa.binarysearch;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class CountRotations {
    public static void main(String[] args) {
        //int[] nums = {10,13,14,17,1,3,5,7,9};
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(new CountRotations().findPivot(nums) + 1);
    }
    public int findPivot(int[] nums) {
        int start = 0, end = nums.length-1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
