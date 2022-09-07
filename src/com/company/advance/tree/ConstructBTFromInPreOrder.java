package com.company.advance.tree;

import java.util.Arrays;
import java.util.HashMap;

public class ConstructBTFromInPreOrder {
    public static void main(String[] args) {

    }
    public static TreeNode buildTree(TreeNode root,int[] preOrder,int[] inOrder) {
        HashMap<Integer,Integer> inOrderHM = new HashMap<>();
        for(int i = 0; i<inOrder.length; i++) {
            if(!inOrderHM.containsKey(inOrder[i])) inOrderHM.put(inOrder[i],i);
        }

        if(inOrder == null) return null;
        int rootValue = preOrder[0];
        int rootIndex = inOrderHM.get(rootValue);
        int leftNodesIndex = rootIndex-1;
        int rightNodesIndex = rootIndex+1;

        int lenLeft = leftNodesIndex - 0 + 1;
        int lenRight = inOrder.length - rightNodesIndex + 1;

        preOrder = Arrays.copyOfRange(preOrder,1,lenLeft+1);
        inOrder = Arrays.copyOfRange(inOrder,lenLeft+1,inOrder.length-1);
        root = new TreeNode(rootValue);
        root.left = buildTree(root, preOrder,inOrder);
        root.right = buildTree(root, preOrder,inOrder);
        return null;
    }
}
