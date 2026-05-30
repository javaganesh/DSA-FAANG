package com.dsa.bst;

import java.util.ArrayList;
import java.util.List;

public class MaxImumNodeBST {
    private static void inoderTravsal(Node root, List<Integer> sortedInorder) {
         if(root==null) return;
         inoderTravsal(root.left,sortedInorder);
         sortedInorder.add(root.data);
         inoderTravsal(root.right,sortedInorder);

    }
    public static int maxValue(Node node) {
        if(node==null)
            return -1;
        // Using a list to hold inorder elements
        List<Integer> sortedInorder = new ArrayList<>();
        inoderTravsal(node,sortedInorder);
        return sortedInorder.get(sortedInorder.size()-1);

    }



    public static void main(String[] args) {
     Node root = new Node(5);
        root.left = new Node(4);
         root.right = new Node(6);root.left.left = new Node(3);
        root.right.right = new Node(7);
        root.left.left.left = new Node(1);
        System.out.println(maxValue(root));
    }
}
