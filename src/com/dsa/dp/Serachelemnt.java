package com.dsa.dp;

import java.util.Arrays;

public class Serachelemnt {
    private static void missingelemnt(int[] arr, int len) {
        Arrays.sort(arr);
        for(int i=1;i<len;i++){

          //  boolean ispresent = serachelement(arr,i);
            if(Arrays.binarySearch(arr,i)<0){
                System.out.println("missing elemnt:"+i);
                break;
            }

        }
    }

    private static boolean serachelement(int[] arr, int elemnt) {
        boolean flag=false;
        for(int i=0;i< arr.length;i++){

            if(arr[i]==elemnt){
                flag=true;
                break;
            }

        }
        if(!flag){
            return false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,4,6,9,8,5};


        missingelemnt(arr,arr.length+1);

    }


}
