package com.tree;

public class NodeDefination {
    public static void addChildNode(Node parent, Node child){
        parent.children.add(child);
    }
    public static void printParents(Node node, Node parent){
        if(parent==null){
            System.out.println(node.data + " -> NULL");
        }
        else {
            System.out.println(node.data + " -> " + parent.data);
        }
        for (Node child : node.children)
            printParents(child, node);
    }
    static void printLeafNodes(Node node) {
        if(node.children.isEmpty()){
            System.out.print(node.data + " ");
            return;
        }
        for (Node child : node.children)
            printLeafNodes(child);
    }
    static void printDegrees(Node node, Node parent) {
        int degree = node.children.size();
        if (parent != null)
            degree++;
        System.out.println(node.data + " -> " + degree);

        for (Node child : node.children)
            printDegrees(child, node);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        System.out.println("=====================================================");
        addChildNode(root, n2);
        addChildNode(root, n3);
        addChildNode(n2, n4);
        addChildNode(n2, n5);

        System.out.println("Parents of each node:");
        printParents(root, null);


        System.out.println("Children of each node:");
        printChildren(root);

        System.out.print("Leaf nodes: ");
        printLeafNodes(root);
        System.out.println();

        System.out.println("Degrees of nodes:");
        printDegrees(root, null);
    }

    static void printChildren(Node node) {
        System.out.print(node.data + " -> ");
        for (Node child : node.children)
            System.out.print(child.data + " ");
        System.out.println();

        for (Node child : node.children)
            printChildren(child);
    }

}
