package com.company.array;

public class EquilibriumScalerSoln {
    public int solve(int[] A) {
        long sum1 = 0;
        for(int i = 0; i < A.length ; i++) sum1 += A[i];
        long sum2 = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length ; i++){
            sum1 -= A[i];
            if(sum1 == sum2){
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if(ans == Integer.MAX_VALUE)ans =- 1;
        return ans;
    }
}

