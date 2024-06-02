package com.dsa.hash.easy;

public class MaximUDistanceBetwwnGivenArray {
    public static void maxDistance(int arr[], int n)
    {
        int maxDistance=Integer.MIN_VALUE;
        int i,j;
     for( i=0;i<n;i++){
         for( j=i+1;j<n;j++){
             if(arr[i]==arr[j]){
               int  d=Math.abs(j-i);
                 System.out.println(arr[i]+" --> "+arr[j]+" "+"Distance btwwen :"+d);


             }

         }

     }

    }
        public static void main(String[] args) {
         int[] arr={ 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 };
         maxDistance(arr, arr.length);
    }
}
