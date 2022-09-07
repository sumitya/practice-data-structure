package com.company.advance.tree;

import java.util.ArrayList;
import java.util.HashMap;

public class ConstructTreeFromInPostOrderHelp {
    public static void main(String[] args) {


    }
    public TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> post) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<in.size(); i++) hm.put(in.get(i), i);

        return buildTree(in, 0, in.size()-1, post, 0, post.size()-1, hm);
    }
    public TreeNode buildTree(ArrayList<Integer> in, int inStart, int inEnd,
                              ArrayList<Integer> post, int postStart, int postEnd, HashMap<Integer, Integer> hm) {

        if(postStart > postEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(post.get(postEnd));
        int idx = hm.get(root.val);
        int numsLeft = idx - inStart;
        root.left = buildTree(in, inStart, idx-1, post, postStart, postStart + numsLeft - 1, hm);
        root.right = buildTree(in, idx+1, inEnd, post, postStart + numsLeft, postEnd - 1, hm);
        return root;
    }
}
