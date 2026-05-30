package com.dsa.string;

import java.util.Arrays;

public class StringRevseWords {
    public static void main(String[] args) {
        String str="geeks quiz practice code";
        String[] wordArry = str.split("\\s+");
        System.out.println(Arrays.toString(wordArry));
        reverse(wordArry,0);
        System.out.println("Reversed Array: " + Arrays.toString(wordArry));
        String reversedString = String.join(" ", wordArry);
        System.out.println("Reversed String: " + reversedString);
    }

    private static void reverse(String[] wordArry,int idx) {
        if(idx==(wordArry.length)/2){
            return ;
        }
        swapString(wordArry, idx, wordArry.length - 1 - idx);
        reverse(wordArry,idx+1);
    }
    private static void swapString(String[] wordArray, int i, int j) {
        String temp = wordArray[i];
        wordArray[i] = wordArray[j];
        wordArray[j] = temp;
    }
   
}
