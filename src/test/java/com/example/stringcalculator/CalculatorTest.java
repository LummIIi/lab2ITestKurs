package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void addEmptyStringShouldReturnZero() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");

        assertThat(result).isEqualTo(0);

    }


}
