package com.dsa.stack;

import java.util.Stack;

public class ReverseStack {
    private static void reverseStack(Stack<Integer> stack) {
        if(stack.size()==0){
            return;
        }
        int top=stack.pop();
        reverseStack(stack);
        pushAtbootam(stack,top);

    }

    private static void pushAtbootam(Stack<Integer> stack, int element) {

        if(stack.size()==0){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        pushAtbootam(stack,element);
        stack.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);reverseStack(stack);
       // pushAtbootam(stack,60);
        System.out.println(stack);
    }



}
