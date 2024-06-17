package com.dsa.recursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(20);
        System.out.println(stack);
        int temp=stack.peek();
        sortStackRecursive(stack);
        System.out.println(stack);

    }

    private static void sortStackRecursive(Stack<Integer> stack) {
       if(!stack.isEmpty()){
           int x = stack.pop();

           // Sort remaining stack
           sortStackRecursive(stack);
           sortedInsert(stack, x);
       }
    }

    private static void sortedInsert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, x);
        stack.push(temp);
    }
}
