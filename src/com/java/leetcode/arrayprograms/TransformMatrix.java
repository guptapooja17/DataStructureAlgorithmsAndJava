package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class TransformMatrix {
    public static void main(String[] args) {
        //int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] matrix = { {1,98,14,6}, {14,5,6,10}, {13,11,9,12} };
        int[][] res = new TransformMatrix().transpose(matrix);
        for (int[] row:res) {
            System.out.println(Arrays.toString(row));
        }
    }
    public int[][] transpose(int[][] matrix) {
        if(matrix.length == matrix[0].length) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
            }
            return matrix;
        }
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
