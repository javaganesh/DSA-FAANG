package com.dsa.recursion_level2;

public class CountEvenNumbersUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        //System.out.println(countEvn(arr,0));
        countEvn(arr,0);
        System.out.println(evnCount);
    }

    /*private static int countEvn(int[] arr, int idx) {
        if(idx> arr.length-1) return 0;

        int rm=countEvn(arr,idx+1);

        if(arr[idx]%2==0){
           return  1+rm;
        }
        return rm;

    }*/


   /*private static int countEvn(int[] arr, int idx) {
        if(idx> arr.length-1) return 0;

       if(arr[idx]%2==0){
          return  1+countEvn(arr,idx+1);
       }

       return countEvn(arr,idx+1);


    }
*/
    private static  int evnCount=0;
    private static void countEvn(int[] arr, int idx) {
        if(idx> arr.length-1) return;
        if(arr[idx]%2==0) evnCount++;
        countEvn(arr,idx+1);



    }


}
