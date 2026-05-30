package com.dsa.tes1;

import java.util.Stack;

public class BalancePerthnhsis {
    private static boolean checkBalncep(String str) {
        Stack<Character> stack=new Stack<>();
        char[] charArray=str.toCharArray();
        for(char ch:charArray){
            switch (ch){
                case '{':
                    stack.push(ch);
                    break;
                case '}':
                    if(!stack.isEmpty()){
                        char c =stack.peek();
                        if(c=='{'){
                            stack.push(ch);
                        }
                    }

                   else{
                       return false;
                   }
                   break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="}{";
        System.out.println( checkBalncep(str));
    }


}
