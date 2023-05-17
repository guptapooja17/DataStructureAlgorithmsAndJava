package com.java.assignments;

import java.util.Scanner;

public class GoOutMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String month = in.next().trim();
        if(month.equals(months.JANUARY.toString()) || month.equals(months.MARCH.toString()) || month.equals(months.MAY.toString())
                || month.equals(months.JULY.toString()) || month.equals(months.AUGUST.toString())
                || month.equals(months.OCTOBER.toString()) || month.equals(months.DECEMBER.toString())
                || month.equals(months.APRIL.toString()) || month.equals(months.JUNE.toString())
                || month.equals(months.NOVEMBER.toString())) {
            System.out.println("No. of even days you can go out are 15");
        } else if (month.equals(months.FEBRUARY.toString())) {
            System.out.println("No. of even days you can go out are 14");
        } else {
            System.out.println("Invalid Input");
        }
    }
};

enum months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
}
