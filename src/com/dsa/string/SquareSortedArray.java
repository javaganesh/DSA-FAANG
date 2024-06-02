package com.dsa.string;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr={-6,-1,2,4,5};
       int[] sortedArray =squareSortedArry(arr);
       for(int elemnt:sortedArray){
           System.out.print(elemnt+" ");
       }


    }

    private static int[] squareSortedArry(int[] arr) {
        int[] squarry=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        int squareIndex=arr.length;
       while(start<end){
           if(arr[start]* arr[start] > arr[end]* arr[end]){
               squarry[squareIndex]=arr[start]* arr[start];
               start++;
           }
           else {
               squarry[squareIndex]=arr[start]* arr[start];
               end--;

           }


       }
        return squarry;

    }
}
