package com.dsa.hash.easy;

import java.util.HashMap;
import java.util.Map;

public class SubSetProblem {
    static int subset(int arr[], int n)
    {
        int result=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            mp.put(arr[i], mp.get(arr[i])==null?1: mp.get(arr[i])+1 );
        }

        // Find the maximum value in map.
         int entryvalue=0;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()){

            if(result<entryvalue){
                result=entry.getValue();
                entryvalue=entry.getKey();

            }
          //  result = Math.max(result, entry.getValue());


        }
        System.out.println(entryvalue);
            return result;

    }

        public static void main(String[] args) {
            int arr[] = { 5, 6, 9, 3, 4, 3, 4 };
            int n = arr.length;
            System.out.println( subset(arr, n));

    }


}
