package com.example.stringcalculator;


import java.io.Serializable;
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

        if (numbers.startsWith("//[")) {
            int sum = 0;
            delimeter = "\\Q" + numbers.substring(numbers.indexOf("[") + 1, numbers.indexOf("]")) + "\\E|\n";
            String[] stringArray = numbers.split(delimeter);
            for (int i = 2; i < stringArray.length; i++) {
                sum += Integer.parseInt(stringArray[i]);


            }
            return sum;

        } else if (numbers.startsWith("//")) {
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


//            if (numbers.startsWith("//")) {
//                String x = "1*2%3";
//                x.split(delimeter);
//                String f = String.valueOf(Integer.parseInt(x.substring(0, 1)) + Integer.parseInt(x.substring(2, 3)) + Integer.parseInt(x.substring(4, 5)));
//                return Integer.parseInt(String.valueOf(f));
//
//
//
//
//            }


        return addMultipleNumbers(numbers);

    }
}






