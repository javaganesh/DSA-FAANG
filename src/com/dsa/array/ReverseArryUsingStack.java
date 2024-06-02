package com.dsa.array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArryUsingStack {
    public static void reverseArrayUsingStack(int[] arr) {

        Stack<Integer> stack=new Stack<>();
        for(int element:arr){
            stack.push(element);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=stack.pop();
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        int[] arr={12,13,14,15,18,178};
     reverseArrayUsingStack(arr);
    }
}
