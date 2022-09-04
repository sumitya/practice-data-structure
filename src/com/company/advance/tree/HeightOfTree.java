package com.company.advance.tree;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.left = new TreeNode("B");
        root.left.left = new TreeNode("D");
        root.left.left.right = new TreeNode("L");
        root.left.left.left = new TreeNode("M");
        root.left.left.left.left = new TreeNode("N");
        System.out.println(getHeight(root));
    }
    public static int getHeight(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        return 1 + Math.max(lHeight , rHeight);
    }
}
