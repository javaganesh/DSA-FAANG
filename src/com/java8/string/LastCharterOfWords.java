package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LastCharterOfWords {
    public static void main(String[] args) {
        String input = "Java Stream API Spring Boot";
        System.out.println(Arrays.stream(input.split("\\s+"))
                        .filter(word->!word.isEmpty())
                .map(s -> String.valueOf(s.charAt(s.length()-1)))
                .collect(Collectors.joining(" ")));

    }
}
