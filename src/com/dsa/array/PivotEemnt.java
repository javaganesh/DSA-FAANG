package com.dsa.array;

import java.util.Arrays;

public class PivotEemnt {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 3, 40, 50};
        int elemnt = 5;
        int k = 0;
        int[] temp=new int[arr.length];
        for(int i=0;i< arr.length-1;i++){
            if(elemnt>=arr[i]){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i< arr.length-1;i++){
            if(elemnt<arr[i]){
                temp[k]=arr[i];
                k++;
            }
        }
        arr=temp;
        System.out.println(Arrays.toString(arr));
    }
}
