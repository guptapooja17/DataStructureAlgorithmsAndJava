package com.java.leetcode.arrayprograms;

import java.util.Deque;
import java.util.LinkedList;

public class MaxEquation {
    public static void main(String[] args) {
        //int[][] points = { {1,3}, {2,0}, {5,10}, {6,-10} };
        //int[][] points = { {-19,9}, {-15,-19}, {-5,-8} };
        int[][] points ={{-19,-12},{-13,-18},{-12,18},{-11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}};
        int k = 6;
        int maxResult = new MaxEquation().findMaxValueOfEquation(points, k);
        System.out.println(maxResult);
    }
//    public int findMaxValueOfEquation(int[][] points, int k) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i < points.length; i++) {
//            for (int j = 0; j < points[i].length -1; j++) {
//                // points[i][j] - points[i-1][j]
//                if ( (points[i-1][j] - points[i][j]) <= k) {
//                    max = Math.max(max, points[i-1][j+1] + points[i][j+1] + (points[i-1][j] - points[i][j]));
//                }
//            }
//        }
//        return max;
//    }

    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < points.length; i++) {
            for (int j = 0; j < points[i].length -1; j++) {
                // points[i][j] - points[i-1][j]
                if ( (points[i-1][j] - points[i][j]) <= k) {
                    max = Math.max(max, points[i-1][j+1] + points[i][j+1] + (points[i-1][j] - points[i][j]));
                }
            }
        }
        return max;
    }
}
