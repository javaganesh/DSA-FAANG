package com.dsa.array;

import java.util.Arrays;

public class InsertElemntArray {
    private static void insertElemntAtBigning(int[] arr) {
        int newElement=0;
        int[] updateelemnt=new int[arr.length+1];
        updateelemnt[0]=newElement;
        for(int i=0;i< arr.length;i++){
            updateelemnt[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(updateelemnt));

    }
    private static void insertElemntAtEnd(int[] arr) {
        int newElement=9;
        int[] updateelemnt=new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            updateelemnt[i]=arr[i];

        }
        updateelemnt[updateelemnt.length-1]=newElement;
        System.out.println(Arrays.toString(updateelemnt));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        insertElemntAtBigning(arr);
        insertElemntAtEnd(arr);
        insertElemntAtSpecficpostion(arr,4);
    }

    private static void insertElemntAtSpecficpostion(int[] arr, int postion) {
        int newElment=44;
        int[] update=new int[arr.length+1];
        for(int i=0;i<postion;i++){
            update[i]=arr[i];
        }
        update[postion]=newElment;
        for(int i=postion;i<arr.length;i++){
            update[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(update ));
    }


}
