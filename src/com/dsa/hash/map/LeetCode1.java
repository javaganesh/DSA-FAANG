package com.dsa.hash.map;

import java.util.HashMap;
import java.util.Set;

class Solution{
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> frqmap=new HashMap<>();
        for(int num:nums){
            frqmap.put(num,frqmap.getOrDefault(num,0)+1);

        }
        int maxFreqSoFar=0, finalAns=0;
       for(Integer num:frqmap.keySet()){
           int currentFreq=frqmap.get(num);
           if((num%2==1) || currentFreq<maxFreqSoFar){
              continue;
           }
           if(currentFreq>maxFreqSoFar || num<finalAns ){
             maxFreqSoFar=currentFreq;
             finalAns=num;
           }

       }

       return finalAns;
    }

}

public class LeetCode1 {
    public static void main(String[] args) {

    }
}
