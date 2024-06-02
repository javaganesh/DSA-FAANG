package com.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,9};
        Stack<Integer> stack=new Stack<>();
        for (int num : arr) {
            if (!isFoundInStack(stack, num)) {
                stack.push(num);
            }
        }
        int[] temp=new int[stack.size()];
        for(int i= temp.length-1;i>=0;i--)
        {
            temp[i]=stack.pop();
        }
        System.out.println(Arrays.toString(temp));

    }

    private static boolean isFoundInStack(Stack<Integer> stack, int num) {
       for(int e:stack){
           if(e==num){
               return true;
           }
       }

        return false;
    }
}
