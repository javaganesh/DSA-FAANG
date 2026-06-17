package com.dsa.heap;

class Heap {

    int[] arr;
    int idx = 1;

    public Heap(int capacity) {
        arr = new int[capacity + 1];
    }

    public void add(int element) {

        arr[idx++] = element;

        // Heapify Up
        int current = idx - 1;

        while (current > 1) {

            int parent = current / 2;

            if (arr[current] < arr[parent]) {

                int temp = arr[current];
                arr[current] = arr[parent];
                arr[parent] = temp;

                current = parent;
            } else {
                break;
            }
        }
    }

    public int remove() {

        if (idx == 1) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = arr[1];

        // Move last element to root
        arr[1] = arr[idx - 1];
        idx--;

        // Heapify Down
        int root = 1;

        while (true) {

            int left = 2 * root;
            int right = 2 * root + 1;

            int smallest = root;

            if (left <= size() && arr[left] < arr[smallest]) {
                smallest = left;
            }

            if (right <= size() && arr[right] < arr[smallest]) {
                smallest = right;
            }

            if (smallest == root) {
                break;
            }

            int temp = arr[root];
            arr[root] = arr[smallest];
            arr[smallest] = temp;

            root = smallest;
        }

        return min;
    }

    public int peek() {

        if (idx == 1) {
            System.out.println("Heap is empty");
            return -1;
        }

        return arr[1];
    }

    public int size() {
        return idx - 1;
    }

    public boolean isEmpty() {
        return idx == 1;
    }

    public void display() {

        for (int i = 1; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class MinHeapImple {

    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.add(10);
        heap.add(15);
        heap.add(8);
        heap.add(9);
        heap.add(4);

        System.out.println("Heap:");
        heap.display();

        System.out.println("Peek: " + heap.peek());

        System.out.println("Removed: " + heap.remove());

        System.out.println("After Removal:");
        heap.display();

        System.out.println("Size: " + heap.size());
    }
}