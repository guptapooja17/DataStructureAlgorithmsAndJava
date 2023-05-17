package com.java.assignments;

import java.util.Scanner;

public class CountNumberOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the occurrence : ");
        int num = in.nextInt();
        int counter = 0;
        while(num > 0) {
            int rem = num % 10;
            System.out.println("here" + rem);
            if(rem == 3) {
                counter++;
            }
            num = num / 10;
            System.out.println(num);
        }
        System.out.println("Number of occurrence of 3 : " + counter);
    }
}
