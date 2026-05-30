package com.dsa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GaneshCode {
    public static void main(String[] args) {
        String str="puspanjali";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry:entrySet){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
