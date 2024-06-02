package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of \"" + str + "\":");
        List<String> subsequences = getAllSubsequences(str);
        System.out.println(subsequences);
    }

    // Function to return a list of all subsequences of a string
    static List<String> getAllSubsequences(String input) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(input, "", subsequences);
        return subsequences;
    }

    // Helper function to generate subsequences recursively
    static void generateSubsequences(String input, String output, List<String> subsequences) {
        // Base case: if the input is empty, add the output to the list
        if (input.length() == 0) {
            subsequences.add(output);
            return;
        }

        // Exclude the first character and recur for the rest
        generateSubsequences(input.substring(1), output, subsequences);

        // Include the first character and recur for the rest
        generateSubsequences(input.substring(1), output + input.charAt(0), subsequences);
    }
}
