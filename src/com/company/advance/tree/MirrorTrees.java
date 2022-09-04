package com.company.advance.tree;

public class MirrorTrees {
    public static void main(String[] args) {
        TreeNode rootA = new TreeNode(1);
        rootA.left = new TreeNode(2);
        rootA.right = new TreeNode(3);
        rootA.left.left = new TreeNode(4);

        TreeNode rootB = new TreeNode(1);
        rootB.left = new TreeNode(3);
        rootB.right = new TreeNode(2);
        rootB.right.right = new TreeNode(4);
        System.out.println(isMirror(rootA,rootB));
    }
    public static boolean isMirror(TreeNode A, TreeNode B) {
        if(A == null && B == null) return true;
        if(A == null || B == null) return false;
        if(A.val != B.val) return false; // -ve base case
        // if(A.val == B.val) return true; //+ve base case , DON'T use it, with first match, it doesn't check further.
        if(isMirror(A.left,B.right) && isMirror(A.right,B.left)) return true;
        else return false;
    }
}
