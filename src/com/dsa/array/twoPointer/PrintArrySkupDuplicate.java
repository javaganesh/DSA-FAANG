package com.dsa.array.twoPointer;

public class PrintArrySkupDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,4,4,5,6,6,7};
        for(int i=1;i< arr.length;i++){
           while(i<arr.length && arr[i]==arr[i-1]){
               System.out.println("d:"+arr[i]);
               i++;
           }

        }
    }
}
