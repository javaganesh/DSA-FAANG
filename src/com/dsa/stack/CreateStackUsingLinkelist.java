package com.dsa.stack;
class Node{
    int val;
    Node next;
    Node(int value){
        this.val=value;
        next=null;
    }

}
class  MyStack{

    Node head;
    int size;
    MyStack(){
        head=null;
        size=0;

    }

    public Node push(int element){
        Node newNode=new Node(element);
        if(length()==0){
            newNode.next=head;
            head=newNode;
            size++;
            return head;

        }

        newNode.next=head;
        head=newNode;
        size++;
        return head;
    }
    public Node pop(){

        if(head==null){
            System.out.println("remove not possible ");
            return head;
        }
        head=head.next;
        size--;
        return head;
    }
    public int peek(){
        if(length()==0){
            System.out.println("No elemnt is Availble");
            return -1;

        }
        return head.val;
    }
    public int length(){
        return size;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
}

public class CreateStackUsingLinkelist {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        /*System.out.println(stack.pop());
        System.out.println(stack.peek());*/
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
         stack.print();
    }
}
