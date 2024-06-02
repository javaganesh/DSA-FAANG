package com.dsa.Queue;

import java.util.LinkedList;

class QueueFullException extends RuntimeException {
    public QueueFullException(String message) {
        super(message);
    }
}

class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String message) {
        super(message);
    }
}

class MyQueue<T> {

    private LinkedList<T> list;
    private int capacity;

    MyQueue(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }

    public void push(T element) {
        if (list.size() == capacity) {
            throw new QueueFullException("Queue is already full");
        }
        list.addLast(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return list.pollFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        for (T e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

public class CreatingQueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(7);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);
        queue.push(70);

        queue.display();

        // Uncommenting the line below will throw QueueFullException
        // queue.push(80);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Popped: " + queue.pop());
        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.display();
        MyQueue<String> queueString = new MyQueue<>(7);
        queueString.push("Ganesh");
        queueString.push("Chandra");
        queueString.push("Parida");
        queueString.push("harish");
        queueString.push("Avimanyu");
        queueString.push("Dasrshan");
        queueString.push("Naresh");

    }
}
