package com.dsa.heap;

import java.util.ArrayList;
import java.util.List;

public class Maxheap {
   private static List<Integer> arr=new ArrayList<>();
    public void insert(int value) {
        arr.add(value);
        int currenindex=arr.size()-1;
        while (currenindex>0){
            int prentIndex=(currenindex-1)/2;
            if(arr.get(prentIndex)>= arr.get(currenindex)) break;
            swapheap(prentIndex,currenindex);
            currenindex=prentIndex;
        }
    }
    public int peek() {
        if (arr.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        return arr.get(0);
    }
    public int removeMax() {
        if (arr.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        int rmMax=arr.get(0);

          int lastElement=arr.get(arr.size()-1);
        if (!arr.isEmpty()) {
            arr.set(0, lastElement);
            heapifyDown(0);
        }

        return rmMax;

    }

    private void heapifyDown(int currentIndex) {
        int size=arr.size();
        int largeElemntindex=currentIndex;
        while(true){
            int leftIndex=2*currentIndex+1;
            int rightIndex=2*currentIndex+2;
            if(leftIndex < size && arr.get(leftIndex) > arr.get(currentIndex)){
                largeElemntindex=leftIndex;
            }
            if(rightIndex < size && arr.get(rightIndex) > arr.get(currentIndex)){
                largeElemntindex=rightIndex;
            }
            if(largeElemntindex==currentIndex) break;
            swapheap(currentIndex,largeElemntindex);
            currentIndex=largeElemntindex;
        }
    }

    private void swapheap(int prentIndex, int currenindex) {
        int temp=arr.get(prentIndex);
        arr.set(prentIndex,arr.get(currenindex));
        arr.set(currenindex,temp);


    }



    public static void main(String[] args) {

        Maxheap maxHeap = new Maxheap();

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(50);
        maxHeap.insert(600);
        System.out.println("After inserting");
        maxHeap.printHeap();

        maxHeap.removeMax();
        System.out.println("After removal");
        maxHeap.printHeap();
    }

    private void printHeap() {
        for(int el:arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
