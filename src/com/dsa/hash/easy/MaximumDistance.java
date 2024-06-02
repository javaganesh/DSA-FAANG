package com.dsa.hash.easy;

import java.util.HashMap;

public class MaximumDistance {
    static int maxDistance(int[] arr, int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxD=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i );
            }
            else {
                maxD = Math.max(maxD, i - map.get(arr[i]));
            }
        }
        return maxD;
    }
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int n = arr.length;
        System.out.println(maxDistance(arr, n));
    }
}
