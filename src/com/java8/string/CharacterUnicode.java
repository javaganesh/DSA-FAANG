package com.java8.string;

import java.util.stream.Collectors;

public class CharacterUnicode {
    public static void main(String[] args) {
        String input = "Java";

        String result = input.chars()
                .mapToObj(c->{
                    System.out.println(c);
                  return   String.valueOf(c);
                })
                .collect(Collectors.joining(", "));

        System.out.println("Input   : " + input);
        System.out.println("Unicode : " + result);
    }
}
