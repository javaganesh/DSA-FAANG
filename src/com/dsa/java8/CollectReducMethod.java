package com.dsa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectReducMethod {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ganesh","Chandra","Parida");
        Optional<String> optFulname = list.stream().collect(Collectors.reducing((a, b) -> a.concat(b)));

        optFulname.ifPresentOrElse(s->{
            System.out.println(s);
        },()->{
            System.out.println("Amit Parida");
        });
    }
}
