package com.company.LC;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public static void main(String[] args) {
        subsetsWithDup(new int[]{1,2,2});
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        int subsetSize = 1 << n;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < subsetSize; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (((1<<j) & i) != 0) {
                    // jth bit is set
                    ans.add(nums[j]);
                    System.out.print(nums[j]);
                }
            }
            System.out.println();
            result.add(ans);
        }
        return result;
    }
    public static List<List<Integer>> subsetsWithDup1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            // figure out ith sequence mask
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                // check which all bits are set
                if ((i & (1 << j)) > 0) {
                    ans.add(nums[j]);
                    System.out.print(nums[j]);
                }
            }
            res.add(ans);

            System.out.println();
        }

        return res;
    }
}
