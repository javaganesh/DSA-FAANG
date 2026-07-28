package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class Tcs_01 {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,3,7,8,1,2,5,5,8,9,3,5,5,9,1};
        Map<Integer,Integer> map= new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()!=1){
                System.out.println(entry.getKey()+ " "+entry.getValue());
            }

        }


    }

}
