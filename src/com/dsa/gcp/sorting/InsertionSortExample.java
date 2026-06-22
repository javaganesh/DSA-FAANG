package com.dsa.gcp.sorting;

public class InsertionSortExample {
    private static void insertionSort(int[] arr) {
        for(int i=1;i< arr.length;i++){
            int j=i;
            while (j> 0 && arr[j]< arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,-1,-2,-3,6,7,9,10,11};
        insertionSort(arr);
    }



}
