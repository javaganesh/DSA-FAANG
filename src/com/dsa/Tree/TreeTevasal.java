package com.dsa.Tree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;

    }

}
public class TreeTevasal {
    public static TreeNode   travsal(TreeNode root){
         if(root==null){
             System.out.println("no node further");
             return root;
         }
         TreeNode left=travsal(root.left);
        System.out.println(left.val);

       TreeNode treeNode=new TreeNode(left.val);
       return treeNode;


    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode l1=new TreeNode(20);
        TreeNode l2=new TreeNode(30);
        TreeNode l3=new TreeNode(40);
        TreeNode l4=new TreeNode(50);
        TreeNode l5=new TreeNode(60);
        root.left=l1;
        root.right=l2;
        l1.left=l3;
        l1.right=l4;
        l4.right=l5;
        TreeNode node=travsal(root);
    }
}
