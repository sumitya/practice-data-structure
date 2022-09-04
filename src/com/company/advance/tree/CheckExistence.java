package com.company.advance.tree;

public class CheckExistence {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.left = new TreeNode("B");
        root.left.left = new TreeNode("D");
        root.left.left.right = new TreeNode("L");
        root.left.left.left = new TreeNode("M");
        root.left.left.left.left = new TreeNode("N");
        System.out.println(checkExist(root));
    }
    public static boolean checkExist(TreeNode root) {
        if(root == null) return false;
        if(root.str == "D") return true; // +ve base case
        if(root.left == null && root.right == null) return false; // -ve base case
        if (checkExist(root.left) || checkExist(root.right)) return true;
        else return false;
    }
}
