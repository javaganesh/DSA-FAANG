package com.dsa.stack;

import java.util.Stack;

public class ReverseStackUsingRecusrion {
    private static void reversStack(Stack<Integer> stack) {
        if(stack.isEmpty()){

            return;
        }

        int ele=stack.pop();
        reversStack(stack);
        insertAtLastPostion(stack,ele);

    }

    private static void insertAtLastPostion(Stack<Integer> stack, int ele) {

        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int pop= stack.pop();;
        insertAtLastPostion(stack,ele);
        stack.push(pop);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        reversStack(stack);
        System.out.println(stack);
    }


}
