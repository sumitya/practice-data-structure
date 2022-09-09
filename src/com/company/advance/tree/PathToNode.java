package com.company.advance.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class PathToNode {
    static ArrayList<Integer> res = new ArrayList<>();
    static boolean ans = false;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList());
        solve(root,5);
    }
    public static ArrayList<Integer> solve(TreeNode A, int B) {

        if( A == null)
            return null;

        res.add(A.val);
        if(A.val == B){
            ans = true;
            return res;
        }
        ArrayList<Integer> left = solve(A.left, B);
        if (ans)
            return res;
        ArrayList<Integer> right = solve(A.right, B);
        if (ans)
            return res;
        res.remove(new Integer(A.val));
        return res;
    }

}
