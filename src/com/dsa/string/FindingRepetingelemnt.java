package com.dsa.string;

public class FindingRepetingelemnt {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1};
        int[] temp=new int[arr.length];
        for(int i=0;i< temp.length;i++){
            if(temp[arr[i]]==1){
                System.out.println(arr[i]);
            }
            else {
                temp[arr[i]]++;
            }
        }
    }
}
