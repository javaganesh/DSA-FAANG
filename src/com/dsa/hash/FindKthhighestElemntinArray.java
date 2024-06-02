package com.dsa.hash;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthhighestElemntinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3);
        int k=3;
        for(int i=0;i< arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }
            else{
                if(arr[i]>pq.peek()){

                    pq.remove();
                    pq.add(arr[i]);
                }


            }
            while(pq.size()>0){
                System.out.println(pq.remove());
            }
        }

    }
    }

