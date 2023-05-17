package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int richest = new RichestCustomer().maximumWealth(accounts);
        System.out.println("Richest Wealth " + richest);

        System.out.println("----------------------------------");
        sumofArray(accounts);

    }
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account:
             accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        return maxWealth;
    }

    static void sumofArray(int[][] accounts) {
        int sum[] = new int[accounts.length];
        for (int account = 0; account < accounts.length; account++) {
            for (int wealth = 1; wealth < accounts[account].length; wealth++) {
                sum[account] = sum[account] + accounts[account][wealth] + accounts[account][wealth-1];
            }
        }
        System.out.println("Sum of Array is " + Arrays.toString(sum));

        for (int[] account: accounts) {
            for (int wealth: account) {
                System.out.println(wealth);
            }
        }
    }
}
