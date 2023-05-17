package com.java.dsa.binarysearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class FindEleInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 13, 16, 19, 22, 30, 35, 40, 45, 51, 60};
        int target = 19;
        int index = new FindEleInfiniteArray().findIndex(nums, target);
        System.out.println("Index of target element is  : " + index);
    }
    public int findIndex(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(nums,target,start,end);
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
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
