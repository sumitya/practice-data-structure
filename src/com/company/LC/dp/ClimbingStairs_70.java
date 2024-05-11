package com.company.LC.dp;

public class ClimbingStairs_70 {

    public static void main(String[] args) {

        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        int[] memoArr = new int[n+1];
        return climbStairsMemo(n,memoArr);
    }
    public static int climbStairsMemo(int n, int[] memoArr) {
        //memoization check
        if(memoArr[n] !=0) return memoArr[n];
        //base case
        if(n == 0 || n ==1){
            memoArr[n]= 1;
            return 1;
        }
        //rec. relation
        int ans = climbStairsMemo(n-1,memoArr) + climbStairsMemo(n-2,memoArr);
        memoArr[n] = ans;
        return memoArr[n];
    }
}

//class Solution {
//    public int climbStairs(int n) {
//        Map<Integer, Integer> memo = new HashMap<>();
//        return climbStairs(n, memo);
//    }
//
//    private int climbStairs(int n, Map<Integer, Integer> memo) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        if (!memo.containsKey(n)) {
//            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
//        }
//        return memo.get(n);
//    }
//}