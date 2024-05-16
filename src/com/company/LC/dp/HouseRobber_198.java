package com.company.LC.dp;

import java.util.Arrays;

public class HouseRobber_198 {
    public static void main(String[] args) {
        //int[] houseArr = new int[]{1,2,3,1};
        System.out.println(rob(new int[]{1,2,3,1}));

    }
    public static int rob(int[] nums) {
        int[] dpArr = new int[nums.length];
        Arrays.fill(dpArr,Integer.MIN_VALUE);
        return robBottomUp(nums,dpArr);
    }

    public static int robBottomUp(int[] nums, int[] dpArr) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(nums[0] + nums[2], nums[1]);
        }
        dpArr[0] = nums[0];
        dpArr[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dpArr[i] = Math.max(dpArr[i - 1], nums[i] + dpArr[i - 2]);
        }
        return dpArr[nums.length - 1];
    }
}
