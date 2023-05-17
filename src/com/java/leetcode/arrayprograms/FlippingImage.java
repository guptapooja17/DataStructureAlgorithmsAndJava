package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = { { 1,1,0 } , { 1,0,1 } , { 0,0,0 } };
        int[][] flipImage = new FlippingImage().flipAndInvertImage1(image);
        for (int[] rows: image) {
            System.out.println(Arrays.toString(rows));
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] rows: image) {
            int start = 0;
            int end = rows.length-1;
            while (start <= end) {
                int temp = rows[start];
                rows[start] = rows[end] ^ 1;
                rows[end] = temp ^ 1;
                start++;
                end--;
            }
        }
        return image;
    }

    public int[][] flipAndInvertImage1(int[][] image) {
        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;
            while (start <= end) {
                System.out.println("start    " + row[start] + "    end   " + row[end]);
                if (row[start] == row[end]) {
                    System.out.println("here ");
                    row[start] ^= 1;
                    row[end] = row[start];
                }
                start++;
                end--;
            }
        }
        return image;
    }

}
