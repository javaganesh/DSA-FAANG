package com.dsa.string;

import java.util.HashMap;

public class FindDupicateChareteerInGivenString {
    public static void main(String[] args) {
        String str="abccdd";

        coundDuplicateChareterangivenString(str);
    }
//aaa
    private static void coundDuplicateChareterangivenString(String str) {
        char[] charaArry=str.toCharArray();
        HashMap<Character ,Integer> map=new HashMap<>();
        for(char c:charaArry){
            if(map.containsKey(c)){
               map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
