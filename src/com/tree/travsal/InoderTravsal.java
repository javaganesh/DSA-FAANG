package com.tree.travsal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
     int data;
     Node left;
     Node right;
     Node(int data){
         this.data=data;
         left=right=null;
     }
 }
public class InoderTravsal {
    private static void inOderTravsal(Node root, List<Integer> result) {
        if(root==null ){

            return;
        }
        inOderTravsal(root.left,result);
        result.add(root.data);
        inOderTravsal(root.right,result);
    }



    void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }




    public static void main(String[] args) {
        Node root=new Node(10);
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n2.right=n4;
        List<Integer> result=new ArrayList<>();
        inOderTravsal(root,result);
        System.out.println(result);

    }


}
