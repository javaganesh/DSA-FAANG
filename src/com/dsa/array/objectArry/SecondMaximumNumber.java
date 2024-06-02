package com.dsa.array.objectArry;

public class SecondMaximumNumber {
    private static void findSecondMaxiumElemntArry(int[] arr) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }
            if(arr[i]>smax && fmax!=arr[i]){
                smax=arr[i];
            }
        }
        System.out.println("FirstMaxim:" +fmax);
        System.out.println("secondMaxim:" +smax);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,44,31};

        findSecondMaxiumElemntArry(arr);
    }


}
