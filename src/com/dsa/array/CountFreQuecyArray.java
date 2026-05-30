package com.dsa.array;

import java.util.Arrays;

public class CountFreQuecyArray {
    private static int[] frequcyOfAlphaBeta(String str) {
        int[] fre=new int[26];
        for(char c:str.toCharArray()){

            fre[c-'a']++;
        }
        return fre;

    }
    public static void main(String[] args) {
        String str="abcsabbedddrrttyyubbbwww";
        int[] arr=frequcyOfAlphaBeta(str);
        System.out.println(Arrays.toString(arr));
        System.out.println("================");
        System.out.println('z'-'a');
        System.out.println('z'-'a');
        
    }


}
