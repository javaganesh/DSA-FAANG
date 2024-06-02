package com.dsa.recursion;

public class SearchElemnt {

    private static int serarchElement(int[] arr, int n, int target, int idx) {

        if(idx>=n)
        {
            return -1;
        }
        if(arr[idx]== target){
            return idx;
        }
        return serarchElement(arr,n,target,idx+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;;
        int target=4;
        int resut=serarchElement(arr,n,target,0);
        System.out.println(resut);
    }


}
