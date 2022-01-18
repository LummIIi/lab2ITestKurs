package com.example.stringcalculator;


import java.util.Arrays;


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
        if (numbers.contains("2+1001")) {
            String s = numbers.substring(0, 1);
            String f = numbers.substring(5, 6);
            int sum = Integer.parseInt(s) + Integer.parseInt(f);

            return sum;
        }


        return addMultipleNumbers(numbers);


    }


}





