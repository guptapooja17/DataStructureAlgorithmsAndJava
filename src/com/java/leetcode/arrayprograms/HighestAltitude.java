package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int count = new HighestAltitude().largestAltitude2(gain);
        System.out.println(count);
    }

    public int largestAltitude(int[] gain) {
        int[] points = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        for (int gainIndex = 0; gainIndex < gain.length; gainIndex++) {
            points[gainIndex + 1] = points[gainIndex] + gain[gainIndex];
            if(points[gainIndex] > max) {
                System.out.println("max" + max + "   points[gainIndex + 1] : " + points[gainIndex]);
                max = points[gainIndex];
            }
        }
        return max;
    }

    // 40 MB solution
    public int largestAltitude1(int[] gain) {
        int altitudesum = 0;
        int max = 0;
        for (int gainIndex = 0; gainIndex < gain.length; gainIndex++) {
            altitudesum += gain[gainIndex];
            if (max < altitudesum) {
                max = altitudesum;
            }
        }
        return max;
    }

    // 39MB solution
    public int largestAltitude2(int[] gain) {
        int altitudesum = 0;
        int max = 0;
        for (int gainIndex = 0; gainIndex < gain.length; gainIndex++) {
            altitudesum += gain[gainIndex];
            max = Math.max(max , altitudesum);
        }
        return max;
    }
}
