package com.dsa.array;

import java.util.Arrays;

public class RotatedArryInjava {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int d=2;
        System.out.println("Original Array:"+ Arrays.toString(arr));
        int[] temp=new int[2];
        for(int i=0;i< d;i++){
            temp[i]=arr[i];
        }

        int c=0;

        for(int i=0;i< arr.length-d;i++){
            arr[i]=arr[i+2];
           c=i;
        }

        System.out.println("============>"+Arrays.toString(arr));
        for(int i=0;i< temp.length;i++){
            arr[++c]=temp[i];

        }
        System.out.println("after rotated Array:"+ Arrays.toString(arr));


    }
}
