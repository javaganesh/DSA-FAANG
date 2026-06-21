package com.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargetElemntInArray {
    private static int findKthlargestDElemy(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int ele:arr){
            if(priorityQueue.size()>k){
                priorityQueue.remove();
            }
            priorityQueue.add(ele);
        }
        System.out.println("priorityQueue:"+priorityQueue);
        return priorityQueue.peek();

    }
    public static void main(String[] args) {
        int k=2;
        int[] arr={10,79,78,49,67,56};
        int kth=findKthlargestDElemy(arr,k);
        System.out.println(kth);
    }


}
