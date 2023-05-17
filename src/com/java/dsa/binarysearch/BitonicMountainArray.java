package com.java.dsa.binarysearch;

public class BitonicMountainArray {
    public static void main(String[] args) {
        //int[] arr = {0,1,0};
        int[] arr = {0,1,3,4,7,9,12,4,3,1,0};
        int res = new BitonicMountainArray().peakIndexInMountainArray(arr);
        System.out.println(res);
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
}
