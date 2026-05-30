package com.dsa.test;

public class SecondLargetInArray {
    private static int secondLargestArray(int[] arr) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]> first){
                second=first;
                first=arr[i];
            }
            if(arr[i]!=first && (arr[i]<first && arr[i]> second) ){
                second=arr[i];
            }


        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,6,9,8,8,7,10,10,11,76,20};
        int secondLarget=secondLargestArray(arr);
        System.out.println(secondLarget);
    }


}
