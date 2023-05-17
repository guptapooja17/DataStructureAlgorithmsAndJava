package com.java.dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] nums = {4,6,10,12,12,12,17,18,20,22};
        int[] nums = {1,2,3,5,8,10,11,13};
        int target = 14;
        int index = new BinarySearch().searchTarget(nums,target);
        System.out.println(index);
    }

    public int searchTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            System.out.println("start :  " + start);
            System.out.println("end :  " + end);
            int mid = start + (end - start) / 2;
            System.out.println("mid :  " + mid);
            if ( target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
