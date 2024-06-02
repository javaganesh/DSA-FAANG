package com.dsa.linkedList;

public class SingleLinkedList {
    private Node head;
    private static class Node{
       private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public void printNode(){
        Node temp=this.head;
        do{
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }while (temp!=null);
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        SingleLinkedList lis=new SingleLinkedList();
        lis.head=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node fifth=new Node(50);
        lis.head.next=sec;
        sec.next=third;
        third.next=fourth;
        fourth.next=fifth;
        lis.printNode();
    }
}
