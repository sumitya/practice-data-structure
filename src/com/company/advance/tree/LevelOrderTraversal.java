package com.company.advance.tree;

import java.util.ArrayList;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        ArrayList<ArrayList<Integer>> res = levelOrder(root);
        /**
          1
         / \
         6   2
            /
           3
         */
        System.out.println(root);
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int height = findHeight(A);
        for (int i = 0; i < height; i++) res.add(new ArrayList<>());
        preOrder(res, A, 0);


        return res;
    }
    static int findHeight(TreeNode A) {
        if (A == null)
            return 0;
        return 1 + Math.max(findHeight(A.left), findHeight(A.right));
    }
    static void preOrder(ArrayList<ArrayList<Integer>> res, TreeNode A, int level) {
        if (A == null)
            return;

        preOrder(res, A.left, level + 1);

        preOrder(res, A.right, level + 1);
        res.get(level).add(A.val);
    }
}

