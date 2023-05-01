package com.kata.foobarquix.services;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
  /*  public static void main(String[] args) {
       int in = 5958;

     String ins =   Integer.toString(in);
     String result = "";


        Matcher matcher = Pattern.compile("5").matcher(ins);
        while (matcher.find()) {
            System.out.println(matcher.start());

            result += "Bar";

        }
        System.out.println(result);

        result = isNumberContains(3,2,"ggg");
    }
*/

    private static String isNumberContains(int ref, int input, String output) {

        String concatRef="";
        switch (ref) {
            case 3:
                concatRef = "Foo";
                break;
            case 5:
                concatRef = "Bar";
                break;
            case 7:
                concatRef = "Quix";
                break;
        }


        Matcher matcher = Pattern.compile(Integer.toString(ref)).matcher(Integer.toString(input));
        while (matcher.find()) {
            System.out.println(matcher.start());

            output += concatRef;

        }

        return output;
    }


}
