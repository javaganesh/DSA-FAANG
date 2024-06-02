package com.dsa.designpaatern;

import java.util.Arrays;

public class BubbleSort {
    public static  int[] sortArryUsingBubble(int[] arr){

        for(int i=0;i< arr.length;i++){
            boolean swap=false;
            for(int j=1;j<= arr.length-i-1;j++){
                // elemnt is less then previous elemmnt then sap
                if(arr[j]<arr[j-1]){
                    swapofelemnt(arr, j);
                    swap=true;
                }

            }
            if(!swap){
                break;
            }
        }

        return arr;
    }

    private static void swapofelemnt(int[] arr, int j) {
        int temp= arr[j];
        arr[j]= arr[j -1];
        arr[j -1]=temp;
    }


    public static void main(String[] args) {
        int[] arr={2,1,5,3,4};
        System.out.println(Arrays.toString(sortArryUsingBubble(arr)));

    }
}
