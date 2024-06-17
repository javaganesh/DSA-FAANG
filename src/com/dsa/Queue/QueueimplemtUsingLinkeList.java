package com.dsa.Queue;

import java.util.Queue;

class Node{

    int val;
     Node next;
    Node(int val){
        this.val=val;

    }

}
class QueueLL{
    private  Node head;
    private  Node tail;
    private int size;

    public void add(int x){
        Node temp=new Node(x);
        if(size==0){
            head=tail=temp;

        }
        else{
            tail.next=temp;
            tail=tail.next;
        }
        size++;
    }
    public  int  remove(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        int val= head.val;;
        head=head.next;
        size--;
        return val;
    }

    public int peek(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        return head.val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}

public class QueueimplemtUsingLinkeList {
    public static void main(String[] args) {
        QueueLL queueLL=new QueueLL();
        queueLL.add(10);
        queueLL.add(20);
        queueLL.add(30);
        queueLL.add(40);
        queueLL.add(50);
        queueLL.add(60);
        queueLL.add(70);

        queueLL.display();
        System.out.println(queueLL.peek());
        queueLL.remove();
        queueLL.remove();
        System.out.println("=======after===================");
        queueLL.display();

    }
}
