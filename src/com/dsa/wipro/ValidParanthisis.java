package com.dsa.wipro;

import java.util.Stack;

public class ValidParanthisis {
    private static boolean checkedValidParthis(String str) {
       char[] charArray=str.toCharArray();
        Stack<Character> stack=new Stack<>();


        for(char c:charArray){
           if(c=='{' || c=='[' || c=='('){
               stack.push(c);
           }
           if(!stack.isEmpty()){
               if(c==')' && stack.peek()=='(')
               {
                   stack.pop();
               }


               else if(c=='}' && stack.peek()=='{')
               {
                   stack.pop();
               }
               else if(c==']' && stack.peek()=='[')
               {
                   stack.pop();
               }
           }
           }

         if(stack.isEmpty()) {
             return true;
         }
         else{
             return false;
         }
    }
    public static void main(String[] args) {
        String str1="{}[]()";
        String str2="({{}})";
        String str3="{}[](";
        String str4="()}}[]{{()";

        boolean isValid=checkedValidParthis(str4);
        System.out.println(isValid);

    }



}
