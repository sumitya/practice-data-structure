package com.company.advance.tree;

import java.util.HashMap;

public class ConstructBTFromInPreOrderHelp {
    int preIndex = 0;
    public TreeNode buildTree(int[] pre, int[] in) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<in.length; i++) {
            map.put(in[i], i);
        }
        return buildT(0, in.length-1, in, pre, map);
    }

    TreeNode buildT(int inStart, int inEnd, int[] inOrder, int[] preOrder, HashMap<Integer, Integer> map) {
        if(inStart > inEnd)  return null;
        int num = preOrder[preIndex++];
        TreeNode node = new TreeNode(num);
        if(inStart == inEnd)
            return node;
        int inIndex = map.get(num);
        node.left = buildT(inStart, inIndex-1, inOrder, preOrder, map);
        node.right = buildT(inIndex+1, inEnd, inOrder, preOrder, map);
        return node;
    }
}
