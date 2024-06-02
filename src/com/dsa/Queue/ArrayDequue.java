package com.dsa.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }


    }
}
