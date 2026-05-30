package com.dsa.bst;

public class DeleteNodeBst {
    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if(key< root.data){
            root.left = delete(root.left, key);
        }
        else if(key > root.data){
            root.right = delete(root.right, key);
        }
        else {
            if(root.left==null){
                root=root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3:
            // node with two children

            // Get inorder successor (smallest in right subtree)
            root.data = minValue(root.right);
            // Delete inorder successor
            root.right = delete(root.right, root.data);
        }
      return root;
    }

    int minValue(Node root) {
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return  min;

    }
        public static void main(String[] args) {

    }
}
