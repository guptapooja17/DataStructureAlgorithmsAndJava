package com.java.dsa.binarysearch;

public class RotatedArraySearch {
    public static void main(String[] args) {
        //int[] nums = {4,5,6,7,0,1,2};
        //int[] nums = {1,3,5,7,9,10,13,14,17};
        int[] nums = {2,9,2,2,2};
        int target =  10;
        System.out.println(new RotatedArraySearch().search(nums,target));
    }
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        if ( nums[pivot] == target) {
            return pivot;
        } else if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        } else {
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
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

    int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
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
