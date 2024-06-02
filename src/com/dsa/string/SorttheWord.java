package com.dsa.string;

import java.util.Arrays;

public class SorttheWord {
    public static void main(String[] args) {
        String str="Orange,Apple,Banana";
        String[] strArray = str.split(",");
        Arrays.sort(strArray);
        String result="";
        for(String s :strArray){
            result+=s+" ";
        }
        System.out.println(result);
    }
}
