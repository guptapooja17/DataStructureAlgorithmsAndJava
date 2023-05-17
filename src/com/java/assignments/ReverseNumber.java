package com.java.assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = in.nextInt();
        int reverseNum = 0;
        while(num > 0) {
            int rem = num % 10;
            reverseNum = (reverseNum * 10 ) + rem;
            num = num / 10;
        }
        System.out.println("Reversed number is : " + reverseNum);
    }
}
