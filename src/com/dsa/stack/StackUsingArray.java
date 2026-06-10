package com.dsa.stack;
class TwoStacks {

    int[] arr;
    int top1;
    int top2;

    TwoStacks(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Overflow");
        }
    }

    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        return arr[top1--];
    }

    int pop2() {
        if (top2 == arr.length) {
            return -1;
        }
        return arr[top2++];
    }
}


public class StackUsingArray {
    public static void main(String[] args) {

    }
}
