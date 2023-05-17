package com.java.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        int i = findFactorial(num);
        System.out.println("Factorial of num " + num + " is " + i);
    }

    static int findFactorial(int num){
        if(num<=0) {
            return 1;
        }
        int c = 1;
        int fact = 1;
        while(c <= num){
            fact = fact * c;
            c++;
        }
        return fact;
    }
}
