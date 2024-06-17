package com.dsa.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        reversQueue(queue);
        System.out.println("Reverse"+queue);

    }

    private static void reversQueue(Queue<Integer> queue) {
        if(queue.isEmpty()){
            return;
        }
        int data=queue.peek();
        queue.remove();
        reversQueue(queue);
        queue.add(data);

    }
}
