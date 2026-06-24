package com.dsa.array;

public class FindTheTagestIndex {
    public static Integer index=-1;
    public static int findIndex(int[] arr, int target) {
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(!found) return -1;

        return index;
    }
    public static void main(String[] args) {

    }
}
