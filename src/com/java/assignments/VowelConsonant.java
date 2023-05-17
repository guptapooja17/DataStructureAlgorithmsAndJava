package com.java.assignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char c = in.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Character is vowel");
        } else {
            System.out.println("Character is consonant");
        }
    }
}