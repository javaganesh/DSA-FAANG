package com.dsa.stack;

import java.util.Stack;

public class ValidParthntsis {
   static boolean  validParathhis(String str){
       Stack<Character> stack=new Stack<>();
       char[] charArray=str.toCharArray();
       for(char c:charArray){
           if(c=='{' || c=='(' || c=='['){
               stack.push(c);
           }
           else{
               if(stack.isEmpty()){
                   return false;
               }
               else{
                   char top=stack.peek();
                   if((c=='}' && top=='{')||
                           (c==']' && top=='[') ||

                           (c==')' && top=='(')){
                       stack.pop();
                   }
                   else {
                       return false;
                   }
               }
           }
       }
       return stack.isEmpty();
   }
    public static void main(String[] args) {
      String str="{[()]}";
        System.out.println(validParathhis(str));
    }
}
