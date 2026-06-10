package com.dsa.stack;

import java.util.Stack;

public class ValidParenthesis {

    private static boolean validParenthesis(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            // Opening bracket
            if (isOpeningBracket(current)) {
                stack.push(current);
            } else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                // Matching bracket found
                if (isMatchingPair(top, current)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }

    public static void main(String[] args) {

        String str1 = "{[()]}";
        String str2 = "{[()]}{}";
        String str3 = "{[()]}{";
        String str4 = "{[(])}";

        System.out.println(validParenthesis(str1)); // true
        System.out.println(validParenthesis(str2)); // true
        System.out.println(validParenthesis(str3)); // false
        System.out.println(validParenthesis(str4)); // false
    }
}