package com.dsa.string;

public class SortString {
    static final int MAX_CHAR = 26;

    static void sortString(String str) {

        // Hash array to keep count of characters.
        int letters[] = new int[MAX_CHAR];

        // Traverse string and increment
        // count of characters
        for (char x : str.toCharArray()) {
            letters[x-'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }



    }
    public static void main(String[] args) {
        sortString("geeksforgeeks");
    }
}
