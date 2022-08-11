package com.company.array.subarray;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr = {1,2,-3,-4,5,6};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] A) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < A.length; i++){
            currSum = currSum + A[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0){currSum = 0;}

        }

        return maxSum;
    }
}
