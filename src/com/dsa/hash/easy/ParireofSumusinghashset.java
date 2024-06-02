package com.dsa.hash.easy;

import java.util.HashSet;

public class ParireofSumusinghashset {
    public static void parireofSumusinghashset(int[] arr,int taget){
        HashSet<Integer> set=new HashSet<>();

        for(int a:arr){
            int sum=taget-a;
            if(set.contains(sum)){
                System.out.println("yes");
                return ;

            }
            set.add(a);
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        int[] arr={ 1, 4, 45, 6, 10, 8 };
        parireofSumusinghashset(arr,16);
    }
}
