package com.dsa.array.twoPointer;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strArray = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Grouping anagrams
        for (String str : strArray) {
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
        }

        // Printing the anagram groups
        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
