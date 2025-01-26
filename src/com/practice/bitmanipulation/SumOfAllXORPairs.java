package com.practice.bitmanipulation;

public class SumOfAllXORPairs {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8};
        System.out.println(PairsSum(arr));
    }
    public static int PairsSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < 32;i++) {
            int count = 0;
            // at ith bit , how many array elements has set bit
            for (int j = 0; j < arr.length;j++) {
                if(checkSetBit(arr[j],i)) count++;
            }
            // how many XOR Pairs has set bit at ith bit
            int xorPairs = count * arr.length-count;
            // contribution of ith bit in sum
            sum = sum + xorPairs * (1 << i);  // c * (n-c) * 2^i
        }
        // need to multiply by 2, as sum is a sum of upper half of the matrix of all possible xor pairs
        return 2 * sum;
    }
    public static boolean checkSetBit(int element, int i) {
        return ((element >> i) & 1) == 1;
    }
}
