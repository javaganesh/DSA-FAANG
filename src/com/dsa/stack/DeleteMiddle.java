package com.dsa.stack;

import java.util.Stack;

public class DeleteMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        deleteMidleElemnt(stack,30);
        System.out.println(stack);
    }

    private static void deleteMidleElemnt(Stack<Integer> stack, int ele) {
        if(ele==stack.peek()){
            stack.pop();
            return;
        }

        int x=stack.pop();
        deleteMidleElemnt(stack,ele);
        stack.push(x);
    }
}
