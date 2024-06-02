package com.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args) {
        String str="Sandeep";
        stringCompress(str);
    }

    private static void stringCompress(String str) {
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
         if(map.get(str.charAt(i))!=null){
             map.put(str.charAt(i),map.get(str.charAt(i))+1);
         }
         else {
             map.put(str.charAt(i),1);
         }
       }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entr :map.entrySet()){
            sb.append(entr.getKey());
            sb.append(entr.getValue());
        }
        System.out.println(sb);
    }
}
