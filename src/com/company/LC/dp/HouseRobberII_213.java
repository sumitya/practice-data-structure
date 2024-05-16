package com.company.LC.dp;

import java.util.Arrays;

public class HouseRobberII_213 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
        System.out.println(rob(new int[]{1,2,3,1}));

    }
    public static int rob(int[] nums) {
        // make two calls, and get max of both
        // 1st call exclude last element
        // 2nd call exclude first element
        return Math.max(houseRobberBottomUp(0,nums.length-2,nums),
                houseRobberBottomUp(1,nums.length-1,nums));
    }
    public static int houseRobberBottomUp(int start, int end, int[] nums) {
        if(start == end)    return nums[start]; // single element, return same element
        int [] dpArr = new int [nums.length];
        dpArr[start] = nums[start];
        dpArr[start+1] = Math.max(nums[start + 1], nums[start]);  // max of 1st or 2nd house
        for(int i = start + 2; i<=nums.length-1; i++) {
            // get max from i-1 or ( i-2 + your own already calculated answer) , recursion
            dpArr[i] = Math.max(dpArr[i - 1], nums[i] + dpArr[i - 2]);
        }
        return dpArr[end];
    }
}