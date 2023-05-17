package com.java;


import sun.util.calendar.BaseCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample {
    public static void main(String[] args) throws ParseException {
        int N =18;

        if ( (N % 2 == 0) && (N >=2 && N <= 5) ) {
            System.out.println("Not Weird");
        }  else if ( (N % 2 == 0) && (N >=6 && N <= 20) ) {
            System.out.println("Weird");
        } else if ( (N % 2 == 0) && (N > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
