package com.dsa.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}



public class PostOderTravsalUsingStack {
    public List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        List<Integer> result=new ArrayList<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode current=stack1.pop();
            stack2.push(current);
            if(current.left!=null){
                 stack1.push(current.left);
            }
            if(current.right!=null){
                stack1.push(current.right);
            }
        }
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        return result;

    }
    public static void main(String[] args) {

    }
}
