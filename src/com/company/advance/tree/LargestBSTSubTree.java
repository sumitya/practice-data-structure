package com.company.advance.tree;

public class LargestBSTSubTree {
    int maxAns=0;
    public int solve(TreeNode A) {
        if(A==null){
            return 0;
        }
        int count=0;
        if(checkBST(A,Long.MIN_VALUE, Long.MAX_VALUE)){
            count= checkSize(A);
            maxAns=Math.max(maxAns,count);
        }
        solve(A.left);
        solve(A.right);
        return maxAns;
    }
    public boolean checkBST(TreeNode A, long min,long max){
        if(A==null){
            return true;
        }
        if(A.val<=min  ||  A.val>=max){
            return false;
        }
        return checkBST(A.left,min,A.val) && checkBST(A.right, A.val, max);
    }
    public int checkSize(TreeNode A){
        if(A==null){
            return 0;
        }
        return 1+checkSize(A.left)+checkSize(A.right);
    }
}

