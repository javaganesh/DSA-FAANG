package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirsCharterOfWord {
    public static void main(String[] args) {
        String input = "Java Stream API Spring Boot";
        /*System.out.println(Arrays.stream(input.split("\\s+"))
                .map(s -> {
                    return s.charAt(0);
                }).map(c->String.valueOf(c))
                .collect(Collectors.joining(" ")));*/


        String result = Arrays.stream(input.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .map(word -> String.valueOf(word.charAt(0)))
                .collect(Collectors.joining(" "));

        System.out.println("Input  : " + input);
        System.out.println("Output : " + result);



    }
}
