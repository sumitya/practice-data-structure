package com.company.trees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

public class PathToANode {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    public ArrayList<Integer> solve(TreeNode A, int B) {
        boolean flag = traverse(A,B);
        while(!stack.empty()){
            result.add(stack.peek());
            stack.pop();
        }
        return result;
    }
    public boolean traverse(TreeNode A, int B){
        if(A == null){
            return false;
        }
        /*if(A.val == B || traverse(A.left,B) || traverse(A.right,B)){
            stack.push(A.val);
            return true;
        }*/
        return false;
    }
}

