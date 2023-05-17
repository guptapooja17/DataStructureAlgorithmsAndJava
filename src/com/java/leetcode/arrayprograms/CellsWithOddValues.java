package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
        int[][] indices = { {0,1}, {1,1} };
        int m = 2, n = 3;
        int oddCells = new CellsWithOddValues().oddCells(m, n, indices);
        System.out.println("Odd cells " + oddCells);
    }
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int [n];
        int col[] = new int [m];
        for(int x[] : indices)
        {
            System.out.println(Arrays.toString(x));
            row[x[0]]++;
            col[x[1]]++;
        }

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }
        return count;
    }
}
