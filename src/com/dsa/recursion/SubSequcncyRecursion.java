package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequcncyRecursion {
    private static void sequencey(int[] arr, int start, List<Integer> list) {

        if(start== arr.length){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        list.add(arr[start]);

        sequencey(arr,start+1,list);

       // sequencey(arr,start+1,list);


    }


    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> list=new ArrayList<>();
        sequencey(arr,0,list);
    }




}
