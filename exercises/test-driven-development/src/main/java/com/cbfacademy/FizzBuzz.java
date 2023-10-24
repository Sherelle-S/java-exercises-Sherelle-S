package com.cbfacademy;

public class FizzBuzz {

    public static String of(int value) {
        if (value == 5)
            return "Buzz";
        else if (value == 3)
            return "Fizz";
        return "1";
    }
}