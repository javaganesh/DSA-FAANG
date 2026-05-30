package com.dsa.bst;

public class FlootINBSt {
    static int floor(Node root, int x) {
        if(root==null) return -1;
        if(root.data==x) return root.data;
        if(root.data> x){
           return floor(root.left,x);
        }
        int floorValue=floor(root.right,x);
        return (floorValue < x &&  floorValue!=-1) ? floorValue: root.data;

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);

        int x = 14;
        System.out.println(floor(root, x));
    }
}
