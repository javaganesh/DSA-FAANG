package com.dsa.stack;

import java.util.Stack;

public class ReversSeStack {
    private static Stack<Integer> temp=new Stack<>();
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        reverseStack(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
       if(stack.isEmpty()){
           return;
       }
       int top=stack.peek();
       stack.pop();
       reverseStack(stack);
       while(!stack.isEmpty()){
           temp.push(top);
       }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        System.out.println("final:"+stack);
    }
}
