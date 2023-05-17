package com.java.leetcode.arrayprograms;

public class FindTargetIndex {
    public static void main(String[] args) {
        int[] jump = {2,3,1,1,4};
        int[] jump1 = {3,2,1,0,4};
        boolean res = new FindTargetIndex().canJump(jump);
        System.out.println(res);
    }
    public boolean canJump(int[] nums) {

        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
