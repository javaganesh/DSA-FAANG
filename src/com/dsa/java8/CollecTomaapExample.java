package com.dsa.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollecTomaapExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        // Collect elements of the list into a map using the binary operator
        Map<Integer, Integer> resultMap = list.stream()
                .collect(Collectors.toMap(
                        // Key mapper function
                        integer -> integer,
                        // Value mapper function (identity function)
                        integer -> integer,
                        // Binary operator to handle collisions
                        binaryOperator));
        System.out.println(resultMap);

    }
}
