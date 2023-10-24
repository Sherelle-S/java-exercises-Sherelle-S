package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@DisplayName("The Fizz Buzz class should ")
public class FizzBuzzTest {

    @Test
    @DisplayName("return 1 when the input is 1")
    public void return1WhenInputIs1(){
        final String actual = FizzBuzz.of(1);

        assertThat(actual, is("1"));
    }
    
    
    

}
