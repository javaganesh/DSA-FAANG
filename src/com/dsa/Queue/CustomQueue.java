package com.dsa.Queue;

import java.util.ArrayList;
//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class CustomQueue {
    private ArrayList<Integer> arrayList;
    private int front;

    // Constructor
    public CustomQueue() {
        arrayList = new ArrayList<>();
        front = 0;
    }

    // Method to add an element to the queue
    public void push(int element) {
        arrayList.add(element);
    }

    // Method to remove and return the front element of the queue
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int frontElement = arrayList.get(front);
        front++;
        return frontElement;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arrayList.get(front);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == arrayList.size();
    }

    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue();
        queue.push(10);;
        queue.push(20);;
        queue.push(30);;
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
