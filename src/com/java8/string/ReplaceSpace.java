package com.java8.string;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ReplaceSpace {
    public static void main(String[] args) {
        String input = "Java Stream API";

        String result = input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == ' ' ? "-" : String.valueOf(c))
                .collect(Collectors.joining());

        System.out.println("Input  : " + input);
        System.out.println("Output : " + result);

    }
}
