package com.company.advance.arrays;

public class MaxAbsDiff {
    public static void main(String[] args) {
        maxArr(new int[]{1,2,-1});
    }
    public static int maxArr(int[] A) {
        int gMax = Integer.MIN_VALUE;
        for(int i = 0; i<A.length;i++){
            for(int j = 0; j<A.length;j++){
                if(i != j) {
                    int max = Math.abs(A[i] - A[j]) + Math.abs(i - j);
                    if(max > gMax) max = gMax;
                }
            }
        }
        return gMax;
    }
}
