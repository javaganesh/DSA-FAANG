package com.dsa.bst;



public class MorriesTravsal{

    static void morrisTraversal(Node root) {

        // Start traversal from root
        Node current = root;

        // Continue until all nodes are visited
        while (current != null) {

            // CASE 1:
            // If left child does not exist
            if (current.left == null) {

                // Print current node
                System.out.print(current.data + " ");

                // Move to right side
                current = current.right;
            }

            // CASE 2:
            // Left child exists
            else {

                // Move to left subtree
                Node predecessor = current.left;

                /*
                 Find RIGHTMOST node in left subtree

                 Example:
                         1
                        /
                       2
                      / \
                     4   5

                 predecessor becomes 5
                */
                while (predecessor.right != null &&
                        predecessor.right != current) {

                    // Keep moving right
                    predecessor = predecessor.right;
                }

                /*
                 FIRST TIME visiting current node

                 predecessor.right == null means:
                 temporary link not created yet
                */
                if (predecessor.right == null) {

                    /*
                     Create temporary link

                     Example:
                     5.right --> 1

                     This helps us return back
                     without recursion or stack
                    */
                    predecessor.right = current;

                    // Move to left subtree
                    current = current.left;
                }

                /*
                 SECOND TIME visiting current node

                 predecessor.right == current means:
                 left subtree already processed
                */
                else {

                    /*
                     Remove temporary link

                     Restore original tree
                    */
                    predecessor.right = null;

                    // Print current node
                    System.out.print(current.data + " ");

                    // Move to right subtree
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        // Create root node
        Node root = new Node(1);

        // Create left child of 1
        root.left = new Node(2);

        // Create right child of 1
        root.right = new Node(3);

        // Create left child of 2
        root.left.left = new Node(4);

        // Create right child of 2
        root.left.right = new Node(5);

        // Call Morris Traversal
        morrisTraversal(root);
    }
}