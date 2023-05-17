package com.java.leetcode.arrayprograms;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        new SortColors().sortColorsDutch(colors);
    }

    // 2 pass solution
    public void sortColors(int[] colors) {
        int count0=0,count1=0, count2=0;
        for (int c: colors) {
            if(c==0) count0++;
            if(c==1) count1++;
            if(c==2) count2++;
        }

        for (int i = 0; i < colors.length; i++) {
            if (i < count0) {
                colors[i] = 0;
            } else if (i < count0+count1) {
                colors[i] = 1;
            }else {
                colors[i] = 2;
            }
        }
        System.out.println(Arrays.toString(colors));
    }

    // 1 pass solution : Dutch National flag algorithm
    public void sortColorsDutch(int[] colors) {
        int low = 0;
        int mid = 0;
        int high = colors.length-1;
        int temp;

        while (mid < high) {
            if(colors[mid] == 0 ) {
                temp = colors[low];
                colors[low] = colors[mid];
                colors[mid] = temp;
                low++;
                mid++;
            }
            if (colors[mid] == 1) {
                mid++;
            }
            if (colors[mid] == 2) {
                temp = colors[high];
                colors[high] = colors[mid];
                colors[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(colors));
    }

}
