package com.dsa.array.slindingWindow;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateSequncy {
    private static void removeDuplicateUsingSlindingWidow(String str) {
      int n=str.length();
      int  i=0;
        StringBuilder result = new StringBuilder();

      while(i<n){
        result.append(str.charAt(i));

        while(i+1< n && str.charAt(i)== str.charAt(i+1)){
            i++;
        }
        i++;

      }
        System.out.println(result.toString());
    }
    private static String  removeDuplicate(String str) {

        Stack<Character> stack=new Stack<>();
      for(int i=0;i<str.length();i++){
          if(stack.isEmpty() || stack.peek()!=str.charAt(i)){
              stack.push(str.charAt(i));
          }

      }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at front to maintain order
        }
        return result.toString();


    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
       // removeDuplicate(str);
        removeDuplicateUsingSlindingWidow(str);
    }




}
