package com.company.LC.dp;

import java.util.Arrays;

public class PerfectSquares_279 {
    public static void main(String[] args) {
        System.out.println(numSquares(27));
    }
    public static int numSquares(int n) {
        //top donw approach
        int[] dpArr = new int[n + 1];
        Arrays.fill(dpArr,Integer.MIN_VALUE);
        //return numSquaresTopDown(n, dpArr);
        return numSquaresBottomUp(n, dpArr);


    }
    public static int numSquaresTopDown(int n,int[] dpArr) {
        // memoization check
        if (dpArr[n] != Integer.MIN_VALUE)
            return dpArr[n];
        // base case
        if (n == 0) {
            dpArr[n] = 0;
            return 0;
        }
        // rec. relation
        int x = (int)Math.floor(Math.sqrt(n));
        //System.out.println(x);
        int mini = Integer.MAX_VALUE;
        for(int k = x; k >=1;k--) {
            mini = Math.min(mini,1+numSquaresTopDown(n - k*k,dpArr));
        }
        dpArr[n] = mini;
        return dpArr[n];
    }
    public static int numSquaresBottomUp(int n,int[] dpArr) {
        //bottom up approach
        dpArr[0] = 0;
        dpArr[1] = 1;
        for(int i = 2; i<=n;i++) {
            int mini = Integer.MAX_VALUE;
            for(int j = 1; j<=(int)Math.sqrt(i);j++) {
                mini = Math.min(mini,1+numSquaresBottomUp(i-j*j,dpArr));
            }
            dpArr[i] = mini;
        }
        return dpArr[n];
    }
}
