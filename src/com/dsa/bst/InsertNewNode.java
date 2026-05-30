package com.dsa.bst;

public class InsertNewNode {

    static Node insertUsingIterative(Node root, int key){
        Node temp=new Node(key);
        if(root==null) return temp;
        Node curr=root;
        while (curr!=null){
            if(curr.data > key && curr.left!=null){
                curr=curr.left;

            }
            else if(curr.data< key && curr.right!=null ){
                curr=curr.right;
            }
            else break;

        }
        if(curr.data>key){
            curr.left=temp;
        }
        else {
            curr.right=temp;
        }
        return root;

    }
    static Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(root.data>key)
        {
            root.left=insert(root.left,key);
        }
        else {
            root.right=insert(root.right,key);
        }
        return root;

    }
    public static void main(String[] args) {

    }
}
