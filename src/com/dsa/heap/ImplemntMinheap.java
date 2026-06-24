package com.dsa.heap;

import java.util.ArrayList;
import java.util.List;

class Minheap{
    List<Integer> minHeap;
    public Minheap(){
        minHeap=new ArrayList<>();
    }
    public int size(){
        return minHeap.size();
    }
    public int peek() {
        if (minHeap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return minHeap.get(0);
    }
    public void insert(int value){
        minHeap.add(value);
        int currentIndex=minHeap.size();
        while (currentIndex > 0){
            int parentIndex=(currentIndex-1)/2;
            if(minHeap.get(parentIndex)<=minHeap.get(currentIndex)){
                break;
            }
            swapParentAndChild(minHeap,parentIndex,currentIndex);
            currentIndex=parentIndex;
        }
    }
    public int extractMin() {
        if (minHeap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        int min=minHeap.get(0);
        int lastvalue=minHeap.remove(minHeap.size()-1);
        if(!minHeap.isEmpty()){
            minHeap.set(0,lastvalue);
            heapifyDown(0);
        }

        return min;
    }

    private void heapifyDown(int currentIndex) {
        int size=minHeap.size();
        while (true){
            int leftIndex=2*currentIndex+1;
            int rightIndex=2*currentIndex+2;
            int smallest=currentIndex;
            if(leftIndex < size && minHeap.get(leftIndex)< minHeap.get(smallest)){
                smallest=leftIndex;
            }
            if(rightIndex < size && minHeap.get(rightIndex)< minHeap.get(smallest)){
                smallest=rightIndex;
            }
            if (smallest==currentIndex) break;
            swapParentAndChild(minHeap,currentIndex,smallest);
            currentIndex=smallest;
        }
    }

    private void swapParentAndChild(List<Integer> minHeap, int parentIndex, int currentIndex) {
        int temp=minHeap.get(parentIndex);
        minHeap.set(parentIndex,minHeap.get(currentIndex));
        minHeap.set(currentIndex,temp);
    }

}

public class ImplemntMinheap {
    public static void main(String[] args) {

        MinHeap heap = new MinHeap();

        heap.insert(20);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);


    }
}
