package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PushZero {
    static void pushZerosToEnd(int arr[], int n)
    {
      int count=0;
      for(int i=0;i<n;i++){
          if(arr[i]!=0){
              arr[count++]=arr[i];

          }
      }
      while(count<n){
          arr[count++]=0;
      }


    }
    static void pushZerosToEndUsingArrayList(int arr[], int n){
        List<Integer> list = Arrays.stream(arr)
                .boxed()  // Box the primitive int to Integer
                .collect(Collectors.toList());
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                count++;
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < count; i++)
        {

            // inserting the zero into arraylist
            list.add(0);
        }



    }
    static void pushZerosToEndUsing(int arr[], int n)
    {
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    static void pushZerosToEndUsingExtraSapce(int arr[], int n){
        int[] result=new int[arr.length];
        int count=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        while(count>0){
            arr[k++]=0;
            count--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println("===========2nd method==============");
        pushZerosToEndUsing(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("/n");

        System.out.println("==================================================");
        pushZerosToEndUsingArrayList(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

        System.out.println("==================================================");
        pushZerosToEndUsingExtraSapce(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
