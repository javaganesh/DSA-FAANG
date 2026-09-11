package com.java8.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AddPrefix {
    public static void main(String[] args) {
        String input = "Java Stream API";
       String res =Arrays.stream(input.split("\\s"))
                .map(word->"gcp"+word+"->")
                .collect(Collectors.joining());
        System.out.println(res);
    }
}
