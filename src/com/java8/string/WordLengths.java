package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordLengths {
    public static void main(String[] args) {
        String input = "Java Stream API Spring Boot";

        String result = Arrays.stream(input.split("\\s+"))
                .map(word -> String.valueOf(word.length()))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
