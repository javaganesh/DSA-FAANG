package com.dsa.array.twoPointer;

import java.util.Arrays;

public class SumOftwoNumberEqulTothirdNumber {
    private static void findTriplet(int[] arr, int n) {
     for(int i=0;i< n;i++){
         for(int j=i+1;j<n;j++){
             for(int k=j+1;k<n;k++){
                 if((arr[i]+arr[j]==arr[k]) || (arr[i]+arr[k]==arr[j]) || (arr[j]+arr[k]==arr[i]) ){
                     System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);

                 }
             }
         }
     }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 32, 1, 7, 10, 50, 19, 21, 2 };
        int n = arr.length;

        //findTriplet(arr, n);
        findTripletUsingTwoPointer(arr, n);
    }

    private static void findTripletUsingTwoPointer(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {

            int j = 0;
            int k = i - 1;
            while(j<k){
                if(arr[i]==arr[j]+arr[k]){
                    System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);

                }
                if(arr[i] >arr[j]+arr[k]){
                    System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);
                  j++;
                }
                else {
                    k--;
                }
            }


        }

        System.out.println("No such triplet exists");
    }


}
