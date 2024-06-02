package com.dsa.string;

public class printCompressStringSortingOde4 {
    private  static final int MAX = 26;
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = s.length();

        compressStringSortingOder(s, n);
    }

    private static void compressStringSortingOder(String s, int n) {
        // To store the frequency
        // of the characters
        int freq[] = new int[MAX] ;


        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < MAX; i++)
        {

            // If the current alphabet doesn't
            // appear in the string
            if (freq[i] == 0)
                continue;

            System.out.print((char)(i + 'a') +""+ freq[i]);
        }

    }

}
