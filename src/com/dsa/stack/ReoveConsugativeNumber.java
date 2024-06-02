package com.dsa.stack;

import java.util.Stack;

public class ReoveConsugativeNumber {
    private static int[] removeCons(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i< arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            if(arr[i]!=stack.peek() ){
                stack.push(arr[i]);
            }

            if(!stack.isEmpty()){

               /* if(stack.peek()==arr[i] || arr[i]==arr[i+1]==1){
                    stack.pop();
                }*/
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={1,20,10,2,4,3,2};
        int[] result=removeCons(arr);
    }


}
