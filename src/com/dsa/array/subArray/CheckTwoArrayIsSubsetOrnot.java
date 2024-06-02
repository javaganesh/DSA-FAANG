package com.dsa.array.subArray;

public class CheckTwoArrayIsSubsetOrnot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 1, 1, 2};
        int n = arr.length;
        int[] brr = {3, 0, 5, 1};
        int m = brr.length;
        //subSubArryisSubset(arr,n,brr,m);
        System.out.println( subSubArryisSubset2(arr,n,brr,m));
    }

    private static boolean subSubArryisSubset2(int[] arr, int n, int[] brr, int m) {

       int i=0,j=0;
       while (i<n && j<m){
           if(arr[i]==brr[j]){
               i++;
               j++;
               if(j==m){
                   return true;
               }
           }
           else {
               i=i+1;
               j=0;
           }
       }
       return false;
    }

    private static boolean subSubArryisSubset(int[] arr, int n, int[] brr, int m) {

        for(int i=0;i<n-m;i++){
            int j;
            // Loop through elements of subarray and compare with B[]
            for (j = 0; j < m; j++) {
                if (arr[i + j] != brr[j]) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }
}
