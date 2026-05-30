package com.dsa.bst;

public class MinimuBStUsingRecursion {
    static int minValueUsingIterative(Node root){
        if(root==null) return -1;
        Node current=root;
        while (current.left!=null){
            current=current.left;
        }
        return current.data;
    }
    static int minValue(Node root) {
        if(root==null) return root.data;
        return minValue(root.left);
    }

    public static void main(String[] args) {

    }
}
