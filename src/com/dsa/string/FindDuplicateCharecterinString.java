package com.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharecterinString {
    public static String removeDuplicates(String str) {
        char[] characters = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < characters.length; i++) {
            boolean duplicate = false;
            for (int j = i ; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                sb.append(characters[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "abbcccdd";
        System.out.println( removeDuplicates(str));
    }
}
