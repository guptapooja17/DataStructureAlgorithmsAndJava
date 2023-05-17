package com.java.dsa.binarysearch;

public class AgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr1 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 16;
        int ans = new AgnosticBinarySearch().orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    public int orderAgnosticBS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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
