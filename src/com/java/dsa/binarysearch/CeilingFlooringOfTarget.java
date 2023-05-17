package com.java.dsa.binarysearch;

public class CeilingFlooringOfTarget {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,8,10,11,13};
        int target = 9;
        int ceiling = new CeilingFlooringOfTarget().searchCeilingTarget(nums,target);
        System.out.println("Ceiling of target : Index :  " + ceiling);
        int floor = new CeilingFlooringOfTarget().searchFlooringTarget(nums,target);
        System.out.println("Flooring of target : Index :  " + floor);
    }

    // return the smallest number >= target
    public int searchCeilingTarget(int[] nums, int target) {
        // what if the target number is greater than the greatest number in the array
        if (target > nums[nums.length-1]) {
            return -1;
        }

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
        return start;
    }

    // return the greatest number <= target
    public int searchFlooringTarget(int[] nums, int target) {
        // what if the target is smaller than the smallest number in array.
//        if (target < nums[0]) {
//            return -1;
//        }

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
        return end;
    }
}
