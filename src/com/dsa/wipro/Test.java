package com.dsa.wipro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str="Java is an object oriented language ";
           String[] strarry=str.split("");
        List<String> list=new ArrayList<>();

        //

        Arrays.stream(strarry)
                .mapToInt(String::length) // Map each word to its length
                .max() // Find the maximum length
                .ifPresent(maxLength -> System.out.println("Maximum length of each word: " + maxLength));
    }
}
