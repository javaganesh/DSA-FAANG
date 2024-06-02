package com.dsa.array.twoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class SumOftriplateZero {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        findTriplets(arr, n);
        System.out.println("using two pointer tech");

        //findTripletsTwoPointer(arr, n);
        //findTripletsUsingHash(arr,n);
        findTripletsOptimalApproach(arr,n);
    }

    private static void findTripletsOptimalApproach(int[] arr, int n) {
        for(int i=0;i<n-2;i++){
            if(arr[i]+arr[i+1]+arr[i+2]==0){
                System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
                return;
            }
        }
        System.out.println("No such triplet available");
    }

    private static void findTripletsUsingHash(int[] arr, int n) {
        boolean found = false;
        for(int i=0;i<n-1;i++){

            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                 int x= -(arr[i]+arr[j]);
                 if(set.contains(x)){
                     System.out.println(x+","+arr[i]+"," +arr[j]);
                     found=true;
                 }
                 else {
                     set.add(arr[j]);
                 }
            }
        }
        if (found == false) {
            System.out.printf(" No Triplet Found\n");
        }
    }

    private static void findTripletsTwoPointer(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            int l=i+1;
            int r= arr.length-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==0){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r] );
                    break;
                }
                else if(arr[i]+arr[l]+arr[r]>0){
                    r--;
                }
                else {
                    l++;
                }
            }
        }

    }

    private static void findTriplets(int[] arr, int n) {
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0)
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k] );
                }
            }
        }
    }
}
