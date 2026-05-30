package com.tree;

import java.util.ArrayList;
import java.util.List;

// Node structure for tree
class Node {
    int data;
    List<Node> children;

    Node(int x) {
        data = x;
        children = new ArrayList<>();
    }
}