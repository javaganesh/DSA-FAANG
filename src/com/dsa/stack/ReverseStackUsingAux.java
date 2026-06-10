package com.dsa.stack;

import java.util.Stack;

public class ReverseStackUsingAux {
    private static void reverseStackusimAux(Stack<Integer> stack) {
       Stack<Integer> aux=new Stack<>();
       while (!stack.isEmpty()){
           aux.push(stack.pop());
       }
        System.out.println("aux:"+aux);
        System.out.println("st:"+stack);
       stack.addAll(aux);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("original stack:"+stack);
        reverseStackusimAux(stack);
        System.out.println("after revese:"+stack);
    }


}
