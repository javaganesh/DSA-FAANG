package com.dsa.bst;

public class SerachNode {
    static boolean search(Node root, int key){
        if(root==null) return  false;
        if(root.data==key) return true;
        if(key>root.data) {
            return search(root.right,key);
        }
        return search(root.left,key);
    }
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        int key = 7;
        // Searching for key in the BST
        System.out.println(search(root, key));
    }
}
