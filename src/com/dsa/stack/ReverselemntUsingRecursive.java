package com.dsa.stack;

import java.util.Stack;

public class ReverselemntUsingRecursive {
    private static void displayRecursive(Stack<Integer> stack) {
      if(stack.size()==1){
          return;
      }
        int x=stack.pop();
      displayRecursive(stack);
     pushAtbuutom(stack,x);

    }

    private static void pushAtbuutom(Stack<Integer> stack,int elemt) {
        if(stack.size()==0){
            stack.push(elemt);
            return;
        }
        int top=stack.pop();
        pushAtbuutom(stack,elemt);
        stack.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        displayRecursive(stack);
        System.out.println(stack);
    }


}
