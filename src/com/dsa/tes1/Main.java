package com.dsa.tes1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Integer>> listOfMaps = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 10);
        map1.put("banana", 20);
        listOfMaps.add(map1);
        // Creating another map and adding it to the list
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("orange", 15);
        map2.put("grapes", 30);
        listOfMaps.add(map2);

        for(Map<String,Integer> map:listOfMaps){
            System.out.println("nap:"+map);
            for(Map.Entry<String, Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }
        System.out.println("============================");

        Map<String, Integer>  map3 = listOfMaps.stream().flatMap(map -> map.entrySet().stream()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        map3.entrySet().forEach(entrty->{
            System.out.println(entrty.getKey()+" "+entrty.getValue());
        });



    }
}
