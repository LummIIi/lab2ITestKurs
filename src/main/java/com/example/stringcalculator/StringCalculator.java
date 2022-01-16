package com.example.stringcalculator;

import java.awt.image.BufferedImageFilter;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringCalculator {
    private String delimeter = ",|\n";

    public int addMultipleNumbers(String numbers) {
        Stream<String> multipleNumbers = Arrays.stream(numbers.split(delimeter));
        return multipleNumbers.mapToInt(Integer::parseInt).sum();


    }

    public int add(String numbers) {

        if (numbers.equals("")) {
            return 0;

        }
        if (numbers.startsWith("//")) {
            String[] stringarray = numbers.split("\n");
            delimeter = stringarray[0].substring(2);
            numbers = stringarray[1];
        }
        if (numbers.contains("-")) {
            throw new RuntimeException("Negatives are not allowed " + Integer.parseInt(numbers));

        }


        return addMultipleNumbers(numbers);


    }


}





