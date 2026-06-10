package com.dsa.array;

import java.util.Collections;
import java.util.PriorityQueue;

import java.util.PriorityQueue;

public class FindNthGreatestElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}