package com.dsa.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
       String str ="GeeksQuiz";
        Stack<Character> stack=new Stack<>();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<str.length();i++){
           stack.push(str.charAt(i));
       }
       while (!stack.isEmpty()){
           sb.append(stack.pop());

       }
     //  sb.setCharAt(1,'h');
        System.out.println(sb.toString());
    }
}
