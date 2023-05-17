package com.java.assignments;

import java.util.Scanner;

public class SumOfNEO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumOfNeg = 0, sumOfEven = 0, sumOfOdd = 0, num;
        do {
            System.out.println("Enter number: ");
            num = in.nextInt();
            if (num < 0 ) {
                sumOfNeg += num;
            } else if ( num % 2 == 0 ) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }
        } while(num != 0);
        System.out.println("Sum of Negative numbers : " + sumOfNeg);
        System.out.println("Sum of even numbers : " + sumOfEven);
        System.out.println("Sum of odd numbers : " + sumOfOdd);
    }
}
