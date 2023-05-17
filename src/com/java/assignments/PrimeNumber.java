package com.java.assignments;

import java.util.Scanner;

import static java.lang.System.exit;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();

        for (int i = 2; i < num/2 ; i++) {
            if (num < 0) {
                System.out.println("Negative number is not valid");
                exit(0);
            }
            if (num % i == 0) {
                System.out.println("Not a PRIME number");
                exit(0);
            }
        }
        System.out.println("Yes It's a PRIME number");
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= num) {
            if(num % c == 0){
                System.out.println("not prime");
                return false;
            }
            c += 1;
        }
        if(c * c > num) {
            return true;
        }
        return false;
    }
}
