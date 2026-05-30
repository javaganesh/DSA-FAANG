package com.dsa.stack;

import java.util.Stack;

public class AddtheStackElmentAtLastUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
       Stack<Integer> stack1= reverseStackUsingRecusrion(stack);
        System.out.println(stack1);
        /*System.out.println("before stack:"+stack);
        Stack<Integer> update=addtheLastElement(stack,5);
        System.out.println(update);*/
    }

    private static Stack<Integer> reverseStackUsingRecusrion(Stack<Integer> stack) {
     if(stack.isEmpty()){
         return stack;
     }
        int elemnt=stack.pop();
        reverseStackUsingRecusrion(stack);
        Stack<Integer> result=addtheLastElement(stack,elemnt);
        return result;

    }

    private static Stack<Integer> addtheLastElement(Stack<Integer> stack, int elelment) {
        if(stack.isEmpty()){
            stack.push(elelment);
            return stack;


        }
        int top=stack.pop();
        Stack<Integer> result=addtheLastElement(stack,elelment);
        result.push(top);
        return result;
    }
}
