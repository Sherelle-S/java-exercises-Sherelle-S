package com.cbfacademy;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("The LeapYear class should:")
public class LeapYearTest {
    static Stream<Arguments> inputAndOutputProvider() {
        return Stream.of(
            arguments(1600, true),            
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, true),
            arguments(2001, false),
            arguments(2002, false),
            arguments(2003, false),
            arguments(2004, true),
            arguments(2021, false),
            arguments(2022, false),
            arguments(2024, true)


        );
    }
    @ParameterizedTest
    @MethodSource("inputAndOutputProvider")
    @DisplayName("Determine whether it's a leap year or not")
    public void returnExpectedValue(Integer number, Boolean expected){
        final LeapYear year = new LeapYear(number);
        assertThat(year.isLeapYear(), is(expected));
    }
    

    
    
}
