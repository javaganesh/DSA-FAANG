package com.dsa.array;

import java.util.Scanner;

public class BinaryTree {
    private  static class Node{
        private final int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }

    }
    public BinaryTree(){

    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the rootNode:\t");
        int value=sc.nextInt();
        root=new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node root) {
        System.out.println("Do you want to insert left of :"+root.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value of :"+root.value);
            int value=sc.nextInt();
            root.left=new Node(value);
            populate(sc,root.left);
        }

        System.out.println("Do you want to insert right of :"+root.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of :"+root.value);
            int value=sc.nextInt();
            root.right=new Node(value);
            populate(sc,root.right);
        }

    }

    public static void main(String[] args) {

    }
}
