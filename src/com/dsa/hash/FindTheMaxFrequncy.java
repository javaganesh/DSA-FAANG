package com.dsa.hash;

import com.dsa.generic.Igener;

import java.util.HashMap;
import java.util.Map;

public class FindTheMaxFrequncy {
    private static void findMaxFreq(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxiFreq = Integer.MIN_VALUE, maxiElement = arr[0];
        int miniFreq = Integer.MAX_VALUE, miniElement = arr[0];
        for(int i=0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> num : map.entrySet()){
            if(num.getValue()>=maxiFreq){
                maxiFreq = num.getValue();
                maxiElement = num.getKey();
            }
            if(num.getValue()<=miniFreq){
                miniFreq = num.getValue();
                miniElement = num.getKey();
            }
        }
        System.out.println(maxiElement+" "+maxiFreq);
        System.out.println(miniElement+" "+miniFreq);
    }

    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,3,3,3,3};
        findMaxFreq(arr);
    }


}
