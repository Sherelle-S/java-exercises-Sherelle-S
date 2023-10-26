package com.cbfacademy;

public class LeapYear {
    private final Integer year;

    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        }
        return true;
    }
}
/*
 * if(years % 400 == 0) -> true
 * years % 100 == 0 && years % 400 != 0 -> false
 * years % 4 == 0 && years % 100 != 0 -> true
 * years % 4 != 0 -> false
 * 
 */