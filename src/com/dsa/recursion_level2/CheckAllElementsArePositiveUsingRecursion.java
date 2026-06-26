package com.dsa.recursion_level2;

public class CheckAllElementsArePositiveUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {40,10, 20, 30, 40};
        boolean isPositive = checkAllElementsArePositive1(arr, 0);
        System.out.println(isPositive);

    }

   /* private static boolean checkAllElementsArePositive(int[] arr, int idx) {

        if(idx> arr.length-1) return true;

        boolean isPosituve=checkAllElementsArePositive(arr,idx+1);

        if(isPosituve){
            if(arr[idx]> 0) return true;
            else return false;

        }
        else return false;



    }
*/
   private static boolean checkAllElementsArePositive(int[] arr, int idx) {

       if(idx > arr.length - 1)
           return true;

       boolean isPositive =
               checkAllElementsArePositive(arr, idx + 1);

       return isPositive && arr[idx] > 0;
   }
    private static boolean checkAllElementsArePositive1(int[] arr, int idx) {

        if(idx> arr.length-1) return true;

        if(arr[idx]<0) return false;
        return checkAllElementsArePositive(arr,idx+1);


    }
}
