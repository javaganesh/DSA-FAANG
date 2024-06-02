package com.dsa.hash;

import java.util.HashMap;

public class MostCommnElemntInArray {
    private static void findMostCommonElemnt(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int a:arr1){
            if(hashMap.containsKey(a)){
               int val =hashMap.get(a);
               int nf=val+1;
               hashMap.put(a,nf);
            }
            else{
                hashMap.put(a,1);
            }
        }
        for(int val:arr2){
            if(hashMap.containsKey(val)){
                System.out.println(val);
                hashMap.remove(val);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,4,5,6};
        int[] arr2={1,2,3,4,4,7,9};
        findMostCommonElemnt(arr1,arr2);


    }


}
