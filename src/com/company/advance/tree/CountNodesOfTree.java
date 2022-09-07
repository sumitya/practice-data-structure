package com.company.advance.tree;

public class CountNodesOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        System.out.println(getCount(root));

        /**
         *       1
         * 		/ \
         * 	   2    3
         * 		  /
         * 		4
         * 		 \
         * 		  5
         * */
    }
    public static int getCount(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int lCount = getCount(root.left);
        int rCount = getCount(root.right);
        return 1 + lCount + rCount;
    }
}
