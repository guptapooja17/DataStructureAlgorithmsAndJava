package com.java.leetcode.arrayprograms;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num = {1,2,2,2,3,4,4,5,6,7,7};
        int res = new RemoveDuplicate().removeDuplicates(num);
        System.out.println(res);
    }
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
