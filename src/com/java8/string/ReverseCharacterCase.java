package com.java8.string;

import java.util.stream.Collectors;

public class ReverseCharacterCase {
    public static void main(String[] args) {
        String input = "Java Stream 17!";
        String result = input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.isUpperCase(c)
                        ? Character.toLowerCase(c)
                        : Character.isLowerCase(c)
                        ? Character.toUpperCase(c)
                        : c)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);



    }
}
