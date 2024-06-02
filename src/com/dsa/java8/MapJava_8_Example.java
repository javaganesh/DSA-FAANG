package com.dsa.java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapJava_8_Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 20);
        map.put("Diana", 35);
        map.put("Eve", 28);

        System.out.println(
                map.
                entrySet().
                stream().
                filter(entry->entry.getValue()>20).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Ganesh",10);
        map1.put("sureesh",20);
        map1.put("Ramesesh",30);
        map1.put("Harish",40);
        map1.put("Dharmesh",50);

        int sum = map1.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);


        OptionalDouble average = map1.values().stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        if(average.isPresent()){
            System.out.println("Average of values: " + average.getAsDouble());
        }
        else{
            System.out.println("Map is empty");
        }
        boolean allEven = map1.values().stream()
                .allMatch(value -> value % 2 == 0);
        System.out.println("Are all values even? " + allEven);



        boolean anyAbove30 = map1.values().stream()
                .anyMatch(value -> value > 30);
        System.out.println("Is there any value above 30? " + anyAbove30);


        long count = map1.entrySet().stream()
                .count();
        System.out.println("Number of elements: " + count);

        Optional<Integer> max = map1.values().stream()
                .max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else {
            System.out.println("Map is empty");
        }

        Optional<Integer> min = map1.values().stream()
                .min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.get());
        } else {
            System.out.println("Map is empty");
        }


        List<Map.Entry<String, Integer>> subList = map1.entrySet().stream()
                .filter(entry -> entry.getValue() > 25)
                .collect(Collectors.toList());
        System.out.println("Entries with values greater than 25: " + subList);


        List<String> keysToSum = Arrays.asList("John", "Alice", "Bob");
        int sumForKeySubset = map1.entrySet().stream()
                .filter(entry -> keysToSum.contains(entry.getKey()))
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println("Sum of values for keys " + keysToSum + ": " + sumForKeySubset);


        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("John", 25);
        mapA.put("Alice", 30);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("Bob", 20);
        mapB.put("Diana", 35);

        Map<String, Integer> mapC = Stream.concat(mapA.entrySet().stream(), mapB.entrySet().stream()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1));

        System.out.println(mapC);

        mapC.entrySet().removeIf(entry->entry.getValue()>30);
        System.out.println(mapC);

        List<String> keysList = mapC.keySet().stream()
                .collect(Collectors.toList());
        System.out.println("Keys List: " + keysList);

        List<Integer> valuesList = map.values().stream().collect(Collectors.toList());
        System.out.println("Values List: " + valuesList);

        Set<Map.Entry<String, Integer>> entrySet = mapC.entrySet().stream().collect(Collectors.toSet());
        System.out.println("Set of key-value pairs: " + entrySet);


        Set<String> keysWithEvenValues = map.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("Keys with even values: " + keysWithEvenValues);

        int sumParallel = map.values().parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of values using parallel stream: " + sumParallel);


        Set<Map.Entry<String, Integer>> entrySet1 = map.entrySet().stream().collect(Collectors.toSet());
        System.out.println("Set of key-value pairs: " + entrySet1);














    }
}
