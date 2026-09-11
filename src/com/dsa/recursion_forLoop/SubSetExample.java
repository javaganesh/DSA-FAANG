package com.dsa.recursion_forLoop;

import java.util.ArrayList;
import java.util.List;

public class SubSetExample {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        List<Integer> list=new ArrayList<>();
        subSetExample(arr,0,list);
    }

    private static void subSetExample(int[] arr,int start,List<Integer> list) {

        System.out.println(list);
        for(int i=start;i<arr.length;i++){
            list.add(arr[i]);
            subSetExample(arr,i+1,list);
            list.remove(list.size()-1);

        }

    }
}
