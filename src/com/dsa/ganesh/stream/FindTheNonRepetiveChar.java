package com.dsa.ganesh.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheNonRepetiveChar {
    public static void main(String[] args) {
        String str = "aabbcdeff";

        Character result =
                str.chars()
                        .mapToObj(ch -> (char) ch)
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        LinkedHashMap::new,
                                        Collectors.counting()
                                )
                        )
                        .entrySet()
                        .stream()
                        .filter(entry ->
                                entry.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findAny()
                        .orElse(null);

        System.out.println(result);

    }
}
