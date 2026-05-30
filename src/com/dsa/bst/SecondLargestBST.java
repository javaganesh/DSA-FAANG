package com.dsa.bst;

public class SecondLargestBST {
    public static Integer findSecondLargest(Node root) {
        if(root==null || (root.left==null && root.right==null)) return null;
        Node current = root;
        Node parent = null;
        // move to larget node
        while(current!=null){
            current=parent;
            current=current.right;
        }
        // // Case 1:
        //        // Largest node has a left subtree
        if(current.left!=null){
            return findLargest(current.left);
        }
        return parent.data;
    }
    private static int findLargest(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.right.left = new Node(75);

        Integer result = findSecondLargest(root);

        if (result != null) {
            System.out.println("Second largest: " + result);
        } else {
            System.out.println("BST must contain at least 2 nodes.");
        }
    }
}
