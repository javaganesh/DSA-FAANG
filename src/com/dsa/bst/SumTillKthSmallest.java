package com.dsa.bst;

public class SumTillKthSmallest {
    static int count = 0;
    static int sum = 0;
    public static int sumUptoKthSmallest(Node root, int k) {
        count = 0;
        sum = 0;

        inorder(root, k);

        return sum;
    }

    private static void inorder(Node root, int k) {
        if(root==null || count >k) return;

        inorder(root.left,k);
        if(count<k) {
            sum += root.data;
            count++;
        }
        inorder(root.right,k);
    }


    public static void main(String[] args) {

         /*
                 20
                /  \
              10    30
             / \    / \
            5  15  25  35
        */

        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);

        root.left.left = new Node(5);
        root.left.right = new Node(15);

        root.right.left = new Node(25);
        root.right.right = new Node(35);

        int k = 3;

        int result = sumUptoKthSmallest(root, k);

        System.out.println("Sum = " + result);


    }
}
