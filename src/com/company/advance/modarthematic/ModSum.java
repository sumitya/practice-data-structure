package com.company.advance.modarthematic;

import java.util.Arrays;

public class ModSum {
    public static void main(String[] args) {
        solve(new int[]{1,2,3,1,3});
    }
    public static int solve(int[] A) {
        // create frequency Hasset
        int[] freqArray = new int[4];
        for(int i = 0 ;i < A.length; i++){
            freqArray[A[i]]++;
        }
        System.out.println(Arrays.toString(freqArray));

        // loop through freq. map for all possible pairs
        int ans = 0;
        int mod = 1000000007;
        for(int i = 1 ; i < 4; i++){
            for(int j = 1 ; j < 4; j++){
                int val = i % j;
                int cntI = freqArray[i];
                int cntJ = freqArray[j];
                int temp = val * cntI* cntJ;
                ans = (ans % mod+ temp %mod) %mod;
            }
        }
        return ans;
    }
}
