package com.dsa.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LsitWithSetexample {
    public static void main(String[] args) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> a= Arrays.asList(1,3,4,5);
        List<Integer> b= Arrays.asList(1,3,4,5);
        List<Integer> c= Arrays.asList(1,2,3,5);
        List<Integer> d= Arrays.asList(1,4,4,8);

        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        System.out.println(set);
        List<Integer> list = set.stream().flatMap(l -> l.stream().distinct()).
                collect(Collectors.toList());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(list);
        System.out.println(map);
    }
}
