package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TrimEveryWord {
    public static void main(String[] args) {
        String input = "  Java   Stream   API  ";
        String reult= Arrays
                .stream(input.split(" "))
                .map(String::trim)
                .filter(word->!word.isEmpty())
                .collect(Collectors.joining());
        System.out.println(reult);
    }
}
