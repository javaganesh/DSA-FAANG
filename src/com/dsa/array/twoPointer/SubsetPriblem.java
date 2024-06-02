package com.dsa.array.twoPointer;

public class SubsetPriblem {
    public static void main(String[] args) {
       int[] arr={1,2};
       for(int i=0;i<=arr.length;i++){

           for(int j=i;j<= arr.length-1;j++){
               System.out.print(arr[j]+" ");
           }
           System.out.println(" ");

       }

    }



}
