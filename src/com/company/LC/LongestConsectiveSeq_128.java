package com.company.LC;

public class LongestConsectiveSeq_128 {
    public static void main(String[] args) {
        //NOT working atm
        System.out.print(longestConsecutive(new int[]{100,4,200,1,3,2}));

    }
    public static int longestConsecutive(int[] nums) {
        long max = nums[0];
        long min = nums[0];
        long sum = 0;
        long sumN_1Number = 0;
        long sumNNumber = 0;
        for(int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        sumNNumber = (max * (max + 1)) / 2;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        if (min != 1) {
            sumN_1Number = ((min - 1) * ((min - 1) + 1)) / 2;
        }
        for (int num : nums) {
            sum += num;
        }
        long actualSum = sumNNumber - sumN_1Number;
        if (actualSum == sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
