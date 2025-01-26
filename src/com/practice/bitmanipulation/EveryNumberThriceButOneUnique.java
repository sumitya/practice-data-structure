package com.practice.bitmanipulation;

public class EveryNumberThriceButOneUnique {
    public static void main(String[] args) {
        int input1[] = {3,3,3,5,2,2,2,1,1,1};
        int input2[] = {30000,500,100,30000,100,30000,100};
        System.out.println(triple(input2));
    }
    public static int triple(int arr[]) {
        // iterate through all the bits
        // for every bit check no. of sets in all numbers.
            // check if no. of set bits % 3 has remainder.
                // yes, unique no. has bit set at ith bit
                // no, unique no. has bit unset at ith bit

        int ans = 0;
        for (int i = 0; i< arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length;j++) {
                if(setBit(arr[j],i)) count++;
            }
            if(count % 3 == 1) ans += Math.pow(2,i);
        }

        return ans;
    }
    public static boolean setBit(int element, int index) {
        return ((element >> index) & 1) == 1;
    }
}
