package com.company.advance.tree;

import java.util.HashMap;

public class ConstructTreeFromInPostOrder {
    HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        // @TODO: need completion
    }

    public TreeNode buildTree(int[] A, int[] B) {
        for(int i=0; i<A.length; i++) {
            map.put(A[i], i);
        }
        return buildT(0, A.length-1, A, B);
    }
    public TreeNode buildT(int inStart, int inEnd, int[] inOrder, int[] postOrder) {
        int n = inOrder.length;
        if(n == 0) return null;
        if(n == 1) return new TreeNode(inOrder[0]);

        // recursive relation
        int rootVal = postOrder[postOrder.length-1];
        // loop
        int index = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.left = buildT(inStart, index-1, inOrder, postOrder);
        root.right = buildT(index+1, inEnd, inOrder, postOrder);
        return root;

    }
}
