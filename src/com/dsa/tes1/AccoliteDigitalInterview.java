package com.dsa.tes1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccoliteDigitalInterview {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jake", "Jake", "John", "John", "Amit");
        Map<String, Long> nameWithOccu = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(nameWithOccu);

        nameWithOccu.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
