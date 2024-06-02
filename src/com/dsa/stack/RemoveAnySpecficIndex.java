package com.dsa.stack;

import java.util.Stack;

public class RemoveAnySpecficIndex {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int n=5;
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        System.out.println(stack);
        Stack<Integer> temp=new Stack<>();
        while(stack.size()>=n){
            temp.push(stack.pop());
        }
        stack.push(50);
        System.out.println(stack);
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        System.out.println(temp);
        System.out.println(stack);
    }
}
