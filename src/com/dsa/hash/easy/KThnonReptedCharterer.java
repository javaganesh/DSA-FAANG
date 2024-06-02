package com.dsa.hash.easy;

import java.util.HashMap;

public class KThnonReptedCharterer {
    private static int printKDistinct1(int[] arr, int n, int k) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int i: arr){
             if(map.containsKey(i)){
                 map.put(i,map.get(i)+1);
             }
             else {
                 map.put(i,1);
             }

         }
         for(int ele:arr){
             if(map.get(ele)==1){
                 cnt++;
             }
             if(cnt==k){
                 return ele;
             }
         }

        return -1;

    }
    public static void main(String[] args) {

        int ar[] = {1, 2, 1, 3, 4, 2};
        int n = ar.length;
        System.out.println(printKDistinct1(ar, n, 2));
    }


}
