package com.dsa.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class Puspanjliode {
    public static void main(String[] args) {
        String str="puspanjali";
        Set<Character> set=new LinkedHashSet<>();
       for( char c: str.toCharArray()){
           set.add(c);
        }
       for(char c: set){
           System.out.print(c+" ");
       }
    }
}
