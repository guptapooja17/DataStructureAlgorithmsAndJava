package com.java.assignments;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        if (allowedToVote(age)) {
            System.out.println("Allowed to vote.");
        } else {
            System.out.println("You are under age.");
        }
    }

    static boolean allowedToVote(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}