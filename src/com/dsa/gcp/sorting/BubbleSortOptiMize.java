package com.dsa.gcp.sorting;

public class BubbleSortOptiMize {
    public static  void bubbleSortOptimize(int[] arr){
        int n= arr.length;
        for(int i=0;i< n-1;i++){
            boolean isSwapper=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapper=true;

                }
                if(!isSwapper) break;
            }
        }
    }
    public static void main(String[] args) {

    }
}
