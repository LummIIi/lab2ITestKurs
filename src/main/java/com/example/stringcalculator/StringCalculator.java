package com.example.stringcalculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {


    public int addMultipleNumbers(String numbers) {
        Stream<String> multipleNumbers = Arrays.stream(numbers.split(","));
        return multipleNumbers.mapToInt(Integer::parseInt).sum();


    }

    public int add(String numbers) {

        if (numbers.equals("")) {
            return 0;
        }
        return addMultipleNumbers(numbers);

    }
}





