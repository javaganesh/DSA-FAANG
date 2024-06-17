package com.dsa.Senatriobased;

import java.util.HashMap;

public class NotRepetedChater {
    public static void main(String[] args) {
        String str="Java articles are Awesome";
        notRepetedChaterUsingForLoop(str);
        System.out.println("\n");
        System.out.println("using Hashmap");
        notRepetedChaterUsingHashMap(str);
    }

    private static void notRepetedChaterUsingHashMap(String str) {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char c:str.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        // System.out.println(freqMap);
        freqMap.forEach((k,v)->{
            if(v<=1)
            System.out.print(k+" ");
        });
    }

    private static void notRepetedChaterUsingForLoop(String str) {
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=0;j<str.length();j++){
                if( i!=j && str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
