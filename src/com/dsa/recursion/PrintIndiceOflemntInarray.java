package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintIndiceOflemntInarray {
    static  List<Integer> list=new ArrayList<>();
    private static void print(int[] arr, int n, int target, int idx) {
        if(idx>=n){
            return ;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        print(arr,n,target,idx+1);
    }
    public static void main(String[] args) {

        int[] arr={1,5,4,5,5,6,5,7};
        int target=5;
        int n= arr.length;

        print(arr,n,target,0);
        System.out.println(list);
    }


}
