package com.dsa.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.size());
        int i=5;
        while(i-->0){
            stack.push(i+10);

        }
        System.out.println(stack);
        System.out.println(stack.peek());
       // int j=5;
        while(!stack.isEmpty()){
            System.out.println("peek:"+stack.peek());
            System.out.println("after peek"+stack);

            System.out.println("\n");
            System.out.println(stack.pop());
            System.out.println("after poop"+stack);
        }



    }
}
