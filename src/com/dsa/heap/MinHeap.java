package com.dsa.heap;

public class MinHeap {
    int[] heap=new int[10];
    int size=0;
    public void insert(int val){
        heap[size]=val;
        int currentIndex=size;
        heapFyUp(currentIndex);
        size++;
    }
    public int  remove(){
        if(size==0){
            new RuntimeException("heap is Empty");
        }
       int min=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapFyDown(0);

       return min;
    }

    private void heapFyDown(int index) {
           while(true){
               int leftIndex=2*index+1;
               int rightindex=2*index+2;
               int current=index;
               if(leftIndex<size && heap[leftIndex] <heap[current]){
                   current=leftIndex;
               }
               if(rightindex<size && heap[rightindex] <heap[current]){
                   current=rightindex;
               }
               if(current==index) break;
               swap(index,current);
               index=current;
           }
    }

    private void heapFyUp(int index) {
        while (index >0){
            int prentIndex=(index-1)/2;
            if(heap[prentIndex] > heap[index]){
                swap(prentIndex,index);
                index=prentIndex;
            }
            else {
                break;
            }
        }
    }

    private void swap(int prentIndex, int index) {
        int temp=heap[prentIndex];
        heap[prentIndex]=heap[index];
        heap[index]=temp;
    }
    public void printHeap(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap=new MinHeap();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(40);
        System.out.println("Before Inserting s");
        minHeap.printHeap();

        minHeap.insert(5);
        System.out.println("After inserting 5:");
        minHeap.printHeap();
    }
}
