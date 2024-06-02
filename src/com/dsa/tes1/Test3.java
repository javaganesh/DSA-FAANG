package com.dsa.tes1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        String str="Ganesh Chndra Parida";

        char[] charArry = str.toCharArray();

        //conver arrto list
        List<Character> list=new ArrayList<>();
        for(Character c:charArry){
            list.add(c);
        }
        Map<Character, Long>  countMap = list.stream().
                collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> filteredMap = countMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    }
}
