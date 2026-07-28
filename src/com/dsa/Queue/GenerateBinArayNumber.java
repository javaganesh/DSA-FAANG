package com.dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinArayNumber {
    private static void generateBinary(int n) {
        Queue<String>   queue=new LinkedList<>();
        queue.offer("1");
        for(int i=0;i<n;i++){
            String curr= queue.poll();
            System.out.println(curr);
            queue.offer(curr+"0");
            queue.offer(curr+"1");

        }

    }
    public static void main(String[] args) {
        generateBinary(5);

    }


}
