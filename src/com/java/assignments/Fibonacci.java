package com.java.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(first);
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
