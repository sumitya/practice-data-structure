package com.company.advance.tree;

import java.util.ArrayList;

public class PostOrderTraversal {
    static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        postorderTraversal(root);
    }
    public static int[] postorderTraversal(TreeNode A) {
        postOrder(A);
        return res.stream().mapToInt(v -> v).toArray();
    }
    public static void postOrder(TreeNode root) {
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
    }
}
