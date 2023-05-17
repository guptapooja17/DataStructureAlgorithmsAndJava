package com.java.assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int sum = 0;
        int originalNum = num;

        while(num > 0) {
            int rem = num % 10;
            sum += (rem *  rem * rem);
            num = num / 10;
        }
        if (sum == originalNum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
}
