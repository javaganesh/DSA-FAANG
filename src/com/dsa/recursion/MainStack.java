package com.dsa.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class MainStack {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(7);
        qu.add(16);
        qu.add(9);
        qu.add(20);
        qu.add(5);

        sortQueue(qu);
        while (!qu.isEmpty())
        {
            System.out.print(qu.peek() + " ");
            qu.remove();
        }

    }
    private static void sortQueue(Queue<Integer> qu) {
        if(qu.isEmpty())
            return;
        int temp=qu.peek();
        qu.remove();
        sortQueue(qu);
        pushInQueue(qu, temp, qu.size());

    }

    private static void pushInQueue(Queue<Integer> qu, int temp, int size) {

        //base condotion
        if (qu.isEmpty() || size == 0)
        {
            qu.add(temp);
            return;
        } else if (temp<qu.peek()) {
            qu.add(temp);
            FrontToLast(qu, size);
        }
        else{
            qu.add(qu.peek());
            qu.remove();
            pushInQueue(qu, temp, size - 1);
        }

    }

    private static void FrontToLast(Queue<Integer> qu, int size) {
        // Base condition
        if (size <= 0)
            return;

        // pop front element and push
        // this last in a queue
        qu.add(qu.peek());
        qu.remove();

        // Recursive call for pushing element
        FrontToLast(qu, size - 1);

    }
}
