package com.dsa.recursion;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3, 4, 5, 6};
        int traget=4;
        int index=0;
        int findindex=linearSearch(arr,traget,index);
        System.out.println(findindex);

    }
    public  static int linearSearch(int[] arr,int target,int idx){

        if(idx== arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        else {
            return linearSearch(arr,target,idx+1);
        }

    }


}
