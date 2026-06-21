package com.dsa.hash.map;

import java.util.HashMap;
import java.util.Map;

public class GetMaxOccuranceofCharacter {

    private static char getMaxOccuringChar(String ste) {
        Map<Character,Integer> map=new HashMap<>();

        for(char c:ste.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxFreq = 0;
        char result = '\0';
      for(char c:map.keySet()){
          int cfreq= map.get(c);
          if(cfreq> maxFreq && cfreq!=maxFreq){
              maxFreq=cfreq;
              result=c;
          }
      }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("banana"));
    }


}
