package com.java.leetcode.arrayprograms;

public class DigonalSum {
    public static void main(String[] args) {
        int[][] matrix = { {7,3,1,9}, {3,4,6,9}, {6,9,6,6}, {9,5,8,5} };
        int[][] matrix1 = { {5} };
        int[][] matrix3 = { {1,2,3}, {4,5,6}, {7,8,9}};
        int oddCells = new DigonalSum().diagonalSum(matrix);
        System.out.println("Sum of diagonal cells " + oddCells);


        System.out.println(5/2);
        System.out.println(3/2);
    }

    // Work on any length of matrix even/odd
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                if( (i+j) == (matrix.length-1) && i !=j ) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized solution from leet code
    public int diagonalSum1(int[][] mat) {
        int count=0;
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++){
            count +=mat[i][i];
            count+= mat[i][n-i-1];
        }

        if(n*m %2 !=0){
            return count-mat[n/2][n/2];
        }else{
            return count;
        }

    }

}
