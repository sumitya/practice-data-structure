package com.practice.bitmanipulation;

public class GetMaxAndOfPair {
    public static void main(String[] args) {

        int arr[] = {26,13,23,28,27,7,25};
        System.out.println(getMaxAnd(arr));
    }
    public static int getMaxAnd(int arr[]) {
        int ans = 0;
        // start with MSB
        for (int i = 31 ; i >= 0;i--) {
            // for ith bit, get no. of elements with set bit
            int c = 0;
            for(int j = 0; j < arr.length;j++) {
                if(checkSetBit(arr[j],i)) c++;
            }
            if(c >=2) {
                // set the ith bit in ans.
                ans = ans + (1 << i); // ans + 2^i

                // discard all the numbers with ith bit unset
                for(int j = 0; j < arr.length;j++) {
                    if (!checkSetBit(arr[j], i)) arr[j] = 0;
                }
            }
        }

        return ans;
    }

    public static boolean checkSetBit(int element, int i) {
        return ((element >> i) & 1) == 1;
    }
}
