package com.dsa.array;

public class ResizeArray {
    public static int[] reSizeArray(int[] arr,int capacity){
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(arr.length);
       int[] reSizeArray =reSizeArray(arr,arr.length*2);
        System.out.println(reSizeArray.length);


    }
}
