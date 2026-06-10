package com.dsa.stack;

import java.util.Stack;

public class InfixStack {
    static int precedence(char ch) {
        switch (ch) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
    private static String convertx(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
         for(int i=0;i<exp.length();i++){
             char c=exp.charAt(i);
             if(Character.isLetterOrDigit(c)){
                 stack.push(c);
             }
             else if(c=='('){
                 stack.push('C');
             }
             else if(c==')'){
                 while(!stack.isEmpty() && stack.peek()!='(' ){
                     result.append(stack.pop());
                 }
                 stack.pop();
             }


         }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();

    }
    public static void main(String[] args) {
        String exp = "A+B*(C-D)";
        System.out.println(convertx(exp));

    }


}
