package com.java8.string;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterListToString {
    public static void main(String[] args) {
        List<Character> characters = List.of('J', 'a', 'v', 'a');
        String result = characters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Input  : " + characters);
        System.out.println("Output : " + result);
    }
}
