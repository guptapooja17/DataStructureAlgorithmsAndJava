package com.java.assignments;

import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any fruit : ");
        String fruit = in.next().trim();
//        switch (fruit) {
//            case "mango" -> System.out.println("Mango is the king of fruit");
//            case "orange" -> System.out.println("Mango is the king of fruit");
//            case "banana" -> System.out.println("Mango is the king of fruit");
//            default -> System.out.println("Enter Valid Fruit");
//        } Will work in java 11 only

        switch (fruit) {
            case "mango" :
                System.out.println("Mango is king");
                break;
            case "orange":
                System.out.println("Orange is sore");
                break;
            case "banana":
                System.out.println("Banana is healthy");
                break;
            default:
                System.out.println("Enter valid fruit");
        }

    }
}
