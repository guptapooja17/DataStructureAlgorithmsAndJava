package com.java.assignments;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String real = in.next().trim();
        String reverse = "";
        for (int i = real.length()-1; i >=0 ; i--) {
            char c = real.charAt(i);
            reverse += c;
        }
        System.out.println(reverse);
        if (reverse.equals(real)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
