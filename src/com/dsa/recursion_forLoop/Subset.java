package com.dsa.recursion_forLoop;

public class Subset {
    private static void subset(int[] arr, int index, String ans) {

         if(index== arr.length){
             System.out.println(ans);
             return;
         }
        subset(arr,index+1,ans+"["+arr[index]+" "+"]");
        subset(arr,index+1,ans);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        subset(arr,0,"");
    }


}
