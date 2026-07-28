package com.dsa.recursion_forLoop;

public class ArrayWithBackTracking {
    private static void print(int[] arr) {

        for(int i=0;i< arr.length;i++){
            //System.out.print(arr[i]+" ");
            visit(arr[i],0);
        }

    }

    private static void visit(int ele,int level) {

        if(level==3)return;
        System.out.println(ele);
        visit(ele,level+1);
    }

    public static void main(String[] args) {
        int[] arr={10,20,30};
        print(arr);
    }


}
