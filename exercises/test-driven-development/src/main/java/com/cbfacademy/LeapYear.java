package com.cbfacademy;

public class LeapYear {
    private final Integer year;

    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        } else if (this.year % 100 == 0 && this.year % 400 != 0) {
            return false;
        } else if (this.year %4 == 0 && this.year % 100 !=0) {
            return true;
        } else if (this.year %4 != 0) {
            return false;
        }
        return false;
    }
}
/*
 * if(years % 400 == 0) -> true
 * years % 100 == 0 && years % 400 != 0 -> false
 * years % 4 == 0 && years % 100 != 0 -> true
 * years % 4 != 0 -> false
 * 
 */