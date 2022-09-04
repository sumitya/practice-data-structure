package com.company.advance.tree;

public class IdenticalTrees {
    public static void main(String[] args) {
        TreeNode rootA = new TreeNode(1);
        rootA.left = new TreeNode(2);
        rootA.right = new TreeNode(3);
        rootA.left.left = new TreeNode(4);

        TreeNode rootB = new TreeNode(1);
        rootB.left = new TreeNode(2);
        rootB.right = new TreeNode(3);
        rootB.left.left = new TreeNode(4);
        System.out.println(isIdentical(rootA,rootB));
    }
    public static boolean isIdentical(TreeNode A, TreeNode B) {
        if(A == null && B == null) return true;
        if(A == null || B == null) return false;
        if(A.val != B.val) return false; // -ve base case
        // if(A.val == B.val) return true; //+ve base case , DON'T use it, with first match, it doesn't check further.
        if(isIdentical(A.left,B.left) && isIdentical(A.right,B.right)) return true;
        else return false;
    }
}
