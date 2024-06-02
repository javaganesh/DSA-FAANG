package com.dsa.hash.map;

import java.util.HashMap;
import java.util.Map;

public class PutIFAbsent {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
/*
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", null); // null value is allowed
        System.out.println("Map before putIfAbsent(): " + map);

        Integer valueA = map.putIfAbsent("a", 10); // Existing key, so it won't change
        Integer valueD = map.putIfAbsent("d", 4);  // New key, so it will be added
        Integer valueC = map.putIfAbsent("c", 3);
        // After putting new key-value pairs
        System.out.println("Map after putIfAbsent(): " + map);

        System.out.println("Returned value for key 'a': " + valueA); // Should be 1
        System.out.println("Returned value for key 'd': " + valueD); // Should be null (newly added)
        System.out.println("Returned value for key 'c': " + valueC); // Should be null (no change)
*/


        // Adding key-value pairs to the map
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("D", 3);


        // Before computing a new value
        System.out.println("Map before compute(): " + map);
        // Using compute() method
        map.compute("a", (k, v) -> v == null ? 0 : v + 10); // Increment value of 'a' by 10
        map.compute("d", (k, v) -> v == null ? 100 : v + 100); // Add a new key-value pair 'd' with value 100
        map.compute("f",(k,v)->v==null?1:v+11);
        // After computing new values
        System.out.println("Map after compute(): " + map);

        map.computeIfAbsent("a", k -> 10); // Existing key, so it won't change
        map.computeIfAbsent("v", k -> 30); // New key, so it will be added with value 30

        System.out.println(map);


        // Creating a HashMap to store string lengths
        Map<String, Integer> stringLengths = new HashMap<>();

        // Adding some strings to the map
        stringLengths.put("apple", 5);
        stringLengths.put("banana", 6);
        stringLengths.put("orange", 6);



        System.out.println("String lengths map before computeIfAbsent(): " + stringLengths);

        // Using computeIfAbsent() method to add new strings and their lengths
        stringLengths.computeIfAbsent("grape", s -> s.length()); // New key, compute its length and add
        stringLengths.computeIfAbsent("kiwi", s -> s.length()); // New key, compute its length and add


        System.out.println("String lengths map after computeIfAbsent(): " + stringLengths);


   stringLengths.computeIfPresent("orange",(key,value)->value+10);
        System.out.println(stringLengths);

















    }
}
