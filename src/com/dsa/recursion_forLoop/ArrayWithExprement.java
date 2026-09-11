package com.dsa.recursion_forLoop;

public class ArrayWithExprement {
    public  static void vist(int val,int level){
        if(level==2) return;
        System.out.print(val+" ");
        vist(val,level+1);

    }
    public static void main(String[] args) {
        int[] arr={10,20,30};
        for(int i=0;i<arr.length;i++){
            System.out.println("loop:"+i);
            vist(arr[i],0);
            System.out.println("loop pause :"+i);

        }
    }
}
