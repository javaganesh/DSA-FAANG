package com.dsa.bst;

public class TreeTravsal {
    public static void printInorder(Node node){
        if(node==null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);
        System.out.print("Inorder Traversal: ");
        printInorder(root);


    }
}
