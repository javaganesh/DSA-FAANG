package com.dsa.gcp.sorting;

import java.util.Arrays;

public class Segregate0sand1sUsingAdjacentSwaps {
    private static void segregate0sand1sUsingAdjacent(int[] arr) {
      int n= arr.length;
      for(int i=0;i<n;i++){
          boolean flag=false;
          for(int j=0;j<n-i-1;j++){
              /*if(arr[j]==0 && arr[j+1]==1){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                       flag=true;

              }*/
              if(arr[j]==1 && arr[j+1]==0){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                       flag=true;

              }
          }
          if(!flag) break;
      }
    }
    public static void main(String[] args) {
        int[] arr={1, 0, 1, 0, 0, 1};
        segregate0sand1sUsingAdjacent(arr);
        System.out.println(Arrays.toString(arr));
    }



}
