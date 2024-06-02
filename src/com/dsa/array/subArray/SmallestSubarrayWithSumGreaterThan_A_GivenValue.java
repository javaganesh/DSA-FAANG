package com.dsa.array.subArray;

public class SmallestSubarrayWithSumGreaterThan_A_GivenValue {
    public static void main(String[] args) {
/*

        System.out.println(smallestSubarrayWithSumGreaterNavive(new int[]{1, 4, 45, 6, 0, 19},51));
        System.out.println(smallestSubarrayWithSumGreaterNavive(new int[]{1, 10, 5, 2, 7},9));
*/

        System.out.println(smallestSubarrayWithSumGreaterNavive(new int[]{1, 2, 4},8));

    }

    private static int  smallestSubarrayWithSumGreaterNavive(int[] arr, int x) {

        int min=Integer.MAX_VALUE;
        for(int start=0;start< arr.length;start++){

            if(arr[start]>x){
                min=arr[start];
                return arr[start];
            }
            int csum=arr[start];
            for(int end=start+1;end<arr.length;end++){
              csum+=arr[end];
              if(csum>x && csum<min){
                min=csum;
              }
              if(start==end){
                  if(csum<x && csum<min){
                      System.out.println("not possible ");
                      return -1;
                  }
              }
            }


        }
        return min;


    }
}
