package com.cbfacademy;

public class LeapYear {
    private final Integer year;

    public LeapYear(Integer year) {
        this.year = year;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
      }
}

/*
 * if(years % 400 == 0) -> true
 * years % 100 == 0 && years % 400 != 0 -> false
 * years % 4 == 0 && years % 100 != 0 -> true
 * years % 4 != 0 -> false
 * 
 */