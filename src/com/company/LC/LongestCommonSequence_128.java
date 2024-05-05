package com.company.LC;

import java.util.HashSet;

public class LongestCommonSequence_128 {
    static HashSet<Integer> hs = new HashSet<>();

    public static void main(String[] args) {
    System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.print(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    public static int longestConsecutive(int[] nums) {
// Step 1: Handle the base case when the array is empty.
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        // Step 2: Insert all elements of 'nums' into the hash set 'set'.
        for (int num : nums) {
            set.add(num);
        }
        int cnt = 1;        // Initialize a counter for the current consecutive sequence length.
        int longest = 0;    // Initialize a variable to store the maximum consecutive sequence length.
        // Step 3: Iterate through the elements of 'nums'.
        for (int num : nums) {
            // Step 4: If the current element 'num' is the start of a sequence (no 'num-1' in 'set'),
            if (!set.contains(num - 1)) {
                int x = num; // Update 'x' to the current element 'num'.
                cnt = 1;
                // Step 5: While consecutive elements exist in 'set', increment 'cnt' and 'x'.
                while (set.contains(x + 1)) {
                    cnt++;
                    x = x + 1;
                }
            }
            // Step 6: Update 'longest' with the maximum of 'longest' and 'cnt'.
            longest = Math.max(longest, cnt);
        }

        // Step 7: Return 'longest' as the result.
        return longest;
    }
    public static int longestConsecutive1(int[] nums) {
        if(nums.length == 0) return 0;
        for (int num : nums) {
            hs.add(num);
        }
        //int count = 1;
        int longest = 0;
        for (int i = 0; i <= nums.length; i++) {
            int x = i;
            int count = 1;
            if(isGoodStartPoint(i,nums)) {
                while(hs.contains(x+1)) {
                    count++;
                    x = x+1;
                }
            }
        longest = Math.max(longest,count);
        }

        return longest;
    }
    public static boolean isGoodStartPoint(int i,int[] nums) {
        return !hs.contains(nums[i] - 1);
    }
}
