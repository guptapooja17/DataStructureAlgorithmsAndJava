package com.java.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter any operator (+ - * / %) : ");
            char operator = s.next().trim().charAt(0);
            if( operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Enter any two numbers : ");
                int num1 = s.nextInt();
                int num2 = s.nextInt();
                if(operator == '+') {
                    System.out.println(num1 + num2);
                }
                if(operator == '-') {
                    System.out.println(num1 - num2);
                }
                if(operator == '*') {
                    System.out.println(num1 * num2);
                }
                if(operator == '%') {
                    System.out.println(num1 % num2);
                }
                if(operator == '/') {
                    if(num2 != 0) {
                        System.out.println(num1 / num2);
                    }
                    else {
                        System.out.println("cannot divide by 0 ");
                    }
                }
            } else if ( operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!!!");
            }
        }
    }
}
