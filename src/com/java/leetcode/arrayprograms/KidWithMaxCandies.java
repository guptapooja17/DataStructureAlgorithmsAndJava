package com.java.leetcode.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> maxCandies = new KidWithMaxCandies().kidsWithCandies(candies, 3);
        System.out.println(Arrays.toString(maxCandies.stream().toArray()));

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> temp = new ArrayList<>();
        int maxCandie = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandie = extraCandies + candies[i];
            System.out.println("sum " + maxCandie);
            if (maxCandie >= Arrays.stream(candies).max().getAsInt()) {
                temp.add(true);
            } else {
                temp.add(false);
            }
        }
        return temp;
    }
}
