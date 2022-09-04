package com.company.advance.tree;

import java.util.ArrayList;
import java.util.Stack;



public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        inOrder(root);
        /**
          1
         / \
        6   2
           /
          3
        */

    }
    public static int[] inOrder(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(A!=null || !stack.empty()){
            if(A != null){
                stack.push(A);
                A = A.left;
            }else{
                A=stack.pop();
                res.add(A.val);
                A=A.right;
            }
        }
        int[] resArr = new int[res.size()];
        for(int i = 0; i< res.size();i++) resArr[i] = res.get(i);
        return resArr;
    }

}
