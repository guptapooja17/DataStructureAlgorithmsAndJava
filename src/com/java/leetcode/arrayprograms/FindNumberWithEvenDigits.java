package com.java.leetcode.arrayprograms;

public class FindNumberWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 437,315,322,431,686,264,442 };
        int res = new FindNumberWithEvenDigits().findNumbers(nums);
        System.out.println("Numbers with even no. of digits : " + res);
    }

    public int findNumbers(int[] nums) {
        int count=0,noHaveEvenD=0;
        for (int num : nums) {
            count = 0;
            while (num != 0) {
                num = num/10;
                count++;
            }
            if (count%2 == 0) {
                noHaveEvenD++;
            }
        }
        return noHaveEvenD;
    }

    public int findNumbers1(int[] nums) {
        int count=0;
        for (int num : nums) {
            if ((num >=10 && num <=99) || (num >=1000 && num <= 9999)) {
                count++;
            }
        }
        return count;
    }

}
