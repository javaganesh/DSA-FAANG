package com.dsa.Queue;

import java.util.PriorityQueue;

public class JavaQueue {
    public static void main(String[] args) {
    /*    PriorityQueue<String> pqueue=new PriorityQueue<String>();
        pqueue.add("Amit");
        pqueue.add("Vijay");
        pqueue.add("Karan");
        pqueue.add("Jai");
        pqueue.add("Rahul");
        System.out.println("head:"+pqueue.element());
        System.out.println("head:"+pqueue.peek());

    */

        PriorityQueue<String> pqueue=new PriorityQueue<String>();
        pqueue.add("Amit");
        pqueue.add("Vijay");
        pqueue.add("Karan");
        pqueue.add("Jai");
        pqueue.add("Rahul");
        System.out.println(pqueue);
        System.out.println("Head:"+pqueue.element());
        System.out.println("Head:"+pqueue.element());
        System.out.println("iterating the queue elements:");
        pqueue.forEach(q->{
            System.out.println(q);
            System.out.println(q.substring(0,2));

        });
        pqueue.remove();
        System.out.println(pqueue);
        pqueue.poll();
        System.out.println(pqueue);


















    }
}
