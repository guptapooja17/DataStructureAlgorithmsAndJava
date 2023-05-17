package com.java.dsa.binarysearch;

// https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountainArray {
    public static void main(String[] args) {
       int[] arr = new int[] {1,2,3,4,5,3,1};
       int target = 3;
       int index = new FindInMountainArray().findInMountainArray(target, arr);
        System.out.println("Mininum index of target :   " + index);
    }
    public int findInMountainArray(int target, int[] arr) {
        int[] minimumindex = new int[2];
        int peek = peakIndexInMountainArray(arr);
        minimumindex[0] = orderAgnosticBS(arr,target, 0, peek);
        if (minimumindex[0] != -1) {
            return minimumindex[0];
        }
        return orderAgnosticBS(arr,target,peek,arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start < end ) {
            mid = start + (end - start) / 2;

            if ( arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }

    public int orderAgnosticBS(int[] arr, int target,int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}



