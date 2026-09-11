package com.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsToCharacterLists {
    public static void main(String[] args) {
        String input = "Java Stream API";
        List<List<Character>> result = Arrays.stream(input.split("\\s+"))
                .map(word -> word.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
