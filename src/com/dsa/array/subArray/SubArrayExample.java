package com.dsa.array.subArray;

public class SubArrayExample {
 public static  boolean checkSubarraySum(int arr[], int n,

                                     int k, int sum){
        int currentSum=0;
      for(int i=0;i<k;i++ ){
          currentSum+=arr[i];
      }
      if(currentSum==sum){
          return true;
      }
     for(int i=k;i<n;i++){
         currentSum+=arr[i]+arr[i-k];
         if (currentSum == sum)
             return true;
     }

     return false;
 }
    public static void main(String[] args) {

        int[] arr=new int[]{ 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int sum = 18;

        int n = arr.length;

        if (checkSubarraySum(arr, n, k, sum))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
