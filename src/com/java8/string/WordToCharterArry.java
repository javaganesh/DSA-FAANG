package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordToCharterArry {
    public static void main(String[] args) {
        String input = "Java Stream API";
        System.out.println( Arrays.stream(input.split("\\s+"))
                .filter(word->!word.isEmpty())
                .map(word->word.toCharArray())
                        .map(chars -> Arrays.toString(chars))
                .collect(Collectors.toList()));
    }
}
