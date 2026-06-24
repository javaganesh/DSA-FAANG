package com.dsa.heap;

import java.util.PriorityQueue;

public class Connectingropes {
    public int connectRopes(int[] ropes) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int rope:ropes){
            minHeap.offer(rope);
        }
        int cost=0;
        while(minHeap.size() <0){
            int rop1=minHeap.poll();
            int rop2=minHeap.poll();
            cost+=(rop1+rop2);
            minHeap.offer((rop1+rop2));
        }
        return cost;
    }
}
