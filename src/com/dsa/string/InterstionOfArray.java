package com.dsa.string;

import java.util.HashSet;
import java.util.Set;

public class InterstionOfArray {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6};
        int[] arr2={4,5,6,7,8,9};
        Set<Integer> set=new HashSet<>();
         for(int a:arr1){
            set.add(a);
        }
         for(int e:arr2){
             if(!set.contains(e)){
                 set.add(e);
             }
             else {
                 System.out.println(e);
             }
         }
        System.out.println(set);
    }
}
