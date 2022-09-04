package com.company.advance.tree;

public class CountNodesOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.left = new TreeNode("B");
        root.left.left = new TreeNode("D");
        root.left.left.right = new TreeNode("L");
        root.left.left.left = new TreeNode("M");
        root.left.left.left.left = new TreeNode("N");
        System.out.println(getCount(root));
    }
    public static int getCount(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int lCount = getCount(root.left);
        int rCount = getCount(root.right);
        return 1 + lCount + rCount;
    }
}
