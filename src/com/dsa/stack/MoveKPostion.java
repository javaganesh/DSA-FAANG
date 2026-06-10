package com.dsa.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveKPostion {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(queue);
        moivingKPosttionUsingSt(queue,3);
        System.out.println(queue);
    }

    private static Queue<Integer> moivingKPosttionUsingSt(Queue<Integer> queue, int k) {
        movetokPostion(queue,k);
        System.out.println("---q:"+queue);
        int s= queue.size();
        while (s-- >0){
            int x= queue.poll();
            queue.add(x);

        }
        return queue;

    }

    private static void movetokPostion(Queue<Integer> queue, int k) {
        if(k==0) return;
        int elemnt= queue.poll();
        movetokPostion(queue,k-1);
        queue.add(elemnt);

    }
}
