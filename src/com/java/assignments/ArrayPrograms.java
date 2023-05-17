package com.java.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograms {
    public static void main(String[] args) {
        int[] original = new int[6];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 6 digits ");
        for (int i = 0; i < original.length; i++) {
            original[i] = in.nextInt();
        }
        System.out.println("Original array : " + Arrays.toString(original));
        System.out.println("Max element in the array " + maxElementInRange(original, 0,5));

        reverseArray(original);
        System.out.println("Reversed array" + Arrays.toString(original));

        swapElementsInRange(original, 2, 5);
        System.out.println("Swaped array" + Arrays.toString(original));
    }

    // two-pointer method
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swapElementsInRange(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapElementsInRange(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int maxElementInRange(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(arr.length == 0) {
            return -1;
        }

        int maxElement = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i+1] > maxElement) {
                maxElement = arr[i+1];
            }
        }
        return maxElement;
    }
}
