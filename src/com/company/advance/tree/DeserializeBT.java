package com.company.advance.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeserializeBT {
    public static void main(String[] args) {

    }
    public static TreeNode solve(ArrayList<Integer> A) {

        TreeNode root = new TreeNode(A.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(A.get(i)!= -1){
                temp.left = new TreeNode(A.get(i));
                q.add(temp.left);
            }
            i++;
            if(A.get(i)!=-1){
                temp.right = new TreeNode(A.get(i));
                q.add(temp.right);
            }
            i++;
        }
        return root;
    }
}
