package com.dsa.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        /*Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        System.out.println(deque);
        System.out.println("=====================");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("-->"+deque);
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }

        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
*/

        Deque<Book> set=new ArrayDeque<Book>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        set.add(b1);
        set.add(b2);
        set.add(b3);
        System.out.println(set);


        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
