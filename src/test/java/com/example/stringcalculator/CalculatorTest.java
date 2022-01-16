package com.example.stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void addEmptyStringShouldReturnZero() {
        int result = stringCalculator.add("");

        assertThat(result).isEqualTo(0);

    }

    @Test
    void addOneNumberShouldReturnOne() {
        int result = stringCalculator.add("1");

        assertThat(result).isEqualTo(1);


    }

    @Test
    void addTwoNumbersShouldReturnThree() {
        int result = stringCalculator.add("1,2");

        assertThat(result).isEqualTo(3);


    }

    @Test
    void addAnyNumbersAndGetTheSum() {

        assertThat(stringCalculator.add("5,5,5")).isEqualTo(15);


    }

    @Test
    void addNumbersWithSpecialCharacters() {

        int result = stringCalculator.add("1\n2,3");
        assertThat(result).isEqualTo(6);
    }


}
