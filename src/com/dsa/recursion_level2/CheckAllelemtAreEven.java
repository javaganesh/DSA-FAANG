package com.dsa.recursion_level2;

public class CheckAllelemtAreEven {
    public static void main(String[] args) {
       // int[] arr = {2,4,6,8,78};
        int[] arr = {2,4,6,8,79};
        System.out.println( checkAllNumbrEven(arr,0));
    }

    /*private static boolean checkAllNumbrEven(int[] arr, int i) {
        if(i== arr.length){
            return true;
        }

        boolean isEvn=checkAllNumbrEven(arr,i+1);
        return isEvn && arr[i]%2==0;
    }*/
    private static boolean checkAllNumbrEven(int[] arr, int i) {

        if(i == arr.length)
            return true;

        if(arr[i] % 2 != 0)
            return false;

        return checkAllNumbrEven(arr, i + 1);
    }
}
