package com.dsa.linkedList;

public class FindNthNodeFromLast {
    public static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    private static Node nthNode(Node head,int n) {
     int size=0;
     Node temp=head;
     while (temp!=null){
         size++;
         temp=temp.next;
     }
    int m=size-n+1;
     //mth node from start
        int count=0;
        Node t=head;
        while(count<m-1){
            count++;
            t=t.next;
        }

        return t;

    }
     public static  void deleteNthNiodeFromEnd(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<=n;i++){
            fast=fast.next.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;


     }
     public static void disPlay(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
         System.out.println("NULL");
     }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        Node f=new Node(600);
        Node g=new Node(700);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
/*
        System.out.println(a.next.data);
        System.out.println(b.next.data);
        System.out.println(c.next.data);
        System.out.println(d.next.data);
        System.out.println(e.next.data);
        System.out.println(f.next.data);
*/

        /*Node temp=nthNode(a,2);
        System.out.println("2->"+temp.data);
*/

        disPlay(a);
        System.out.println("=========");
        deleteNthNiodeFromEnd(a,2);
        disPlay(a);


    }


}
