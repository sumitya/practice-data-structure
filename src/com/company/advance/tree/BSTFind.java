package com.company.advance.tree;

public class BSTFind {
    public static void main(String[] args) {
        TreeNode rootA = new TreeNode(1);
        rootA.left = new TreeNode(2);
        rootA.right = new TreeNode(3);
        rootA.right.right = new TreeNode(4);
        System.out.println(findInBST(rootA,4));

    }
    public static boolean findInBST(TreeNode root, int val) {
        if(root == null) return false;
        if(root.val == val) return true;
        if(val > root.val) return findInBST(root.right,val);
        if(val < root.val) return findInBST(root.left,val);
        return false;
    }
}
