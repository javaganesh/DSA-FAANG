package com.dsa.string;

public class MakellSame {
    static boolean canMakeAllSame(String str)
    {

        int zeros = 0, ones = 0;

        // Traverse through given string and
        // count numbers of 0's and 1's

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '0')
                ++zeros;
            else
                ++ones;
        }
        return (zeros == 1 || ones == 1);
    }
    public static void main(String[] args) {
        System.out.println(canMakeAllSame("101") ? "Yes" : "No");
    }
}
