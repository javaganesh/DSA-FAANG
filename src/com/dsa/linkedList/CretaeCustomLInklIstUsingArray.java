package com.dsa.linkedList;
class ListNode{
    int val;
    ListNode  next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
    public static ListNode buildLinkedList(int[] arr) {
            if(arr==null || arr.length==0) return null;
            ListNode head=new ListNode(arr[0]);
            ListNode curr=head;
            for(int i=1;i< arr.length;i++){
                ListNode newNode = new ListNode(arr[i]);
                curr.next=newNode;
                curr=curr.next;

            }
          return head;

    }



}

public class CretaeCustomLInklIstUsingArray {
    public static void main(String[] args) {

    }
}
