package com.dsa.java8;

import java.util.List;

public class Gfg {
    public static void main(String[] args) {
        List<Integer> intList
                = List.of(5, 19, 8, 23, 6, 54, 32, 5, 23);
        intList.stream()
                .map(element -> element * element * element)
                .forEach(
                        element -> System.out.print(element + " "));

        System.out.println("=======================================================");

        intList.stream().sorted()
                .map(element -> element * element * element)
                .forEach(
                        element -> System.out.print(element + " "));



        intList.stream().distinct()
                .map(element -> element * element * element)
                .forEach(
                        element -> System.out.print(element + " "));
    }
}
