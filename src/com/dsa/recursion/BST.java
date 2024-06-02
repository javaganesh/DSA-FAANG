package com.dsa.recursion;

public class BST {

    private Node root;

    static class Node {
        private final int data;
        private Node node;

        public Node(int data) {
            this.data = data;
        }
        private Node left;
        private Node right;


    }
    public Node insetNode(Node root,int data){
          if(root==null){
              Node node=new Node(data);
              root=node;
              return root;
          }
        Node node=new Node(data);
          if(root.data<data){
              node.right=insetNode(root.right,data);
          }
        if(root.data >data){
            node.left=insetNode(root.left,data);
        }

          return  root;


    }
    public void print(Node root){
        
    }

    public static void main(String[] args) {


    }
}
