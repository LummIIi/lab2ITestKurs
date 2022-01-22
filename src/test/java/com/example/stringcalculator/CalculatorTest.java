package com.example.stringcalculator;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


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

    @Test
    void addNumbersAndDiscardDelimeter() {

        assertThat(stringCalculator.add("//;\n1;2")).isEqualTo(3);

    }

    @Test
    void negativeNumbersAreNotAllowed() {

        assertThatThrownBy(() -> stringCalculator.add("-5")).hasMessageContaining("Negatives are not allowed ");

    }

    @Test
    void numbersAbove1000ShouldBeIgnored() {
        assertThat(stringCalculator.add("2+1001")).isEqualTo(3);
    }

    @Test
    void numberWithMultipelDelimitersShouldBeIgnored() {
        assertThat(stringCalculator.add("//[***]\n1***2***3")).isEqualTo(6);
    }

    @Test
    void allowMultipleDelimiters() {
        assertThat(stringCalculator.add("//[*][%]\n1*2%3")).isEqualTo(6);
    }


}
