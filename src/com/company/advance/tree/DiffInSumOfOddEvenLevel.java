package com.company.advance.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DiffInSumOfOddEvenLevel {
    public static void main(String[] args) {
        //solve();
    }
    public static int solve(TreeNode root) {
        //Initial level is specified as odd in question
        //We can use level order traversal and queue as our candidate list
        int oddEvenDiff = 0;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        boolean isOddLevel = true;
        while (!qu.isEmpty()){
            int n = qu.size();
            for (int i = 1 ; i <= n ; ++i){
                TreeNode currentNode = qu.poll();
                assert currentNode != null;
                if(isOddLevel){
                    oddEvenDiff += currentNode.val;
                }
                else{
                    oddEvenDiff -= currentNode.val;
                }
                if(currentNode.left != null){
                    qu.add(currentNode.left);
                }
                if(currentNode.right != null){
                    qu.add(currentNode.right);
                }
            }
            isOddLevel = !isOddLevel;
        }
        return oddEvenDiff;
    }

}
    