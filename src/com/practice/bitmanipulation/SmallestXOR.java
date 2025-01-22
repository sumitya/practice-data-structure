package com.practice.bitmanipulation;

public class SmallestXOR {
    public static void main(String[] args) {
        System.out.println(findMinXOR(3,1));

    }
    public static int findMinXOR(int A, int B) {
        // approach
        // count no. of set bits in A = x
        // case 1, if x = b, ans = A
        // case 2, if x > b, put x bits from left and remaining bits(b-x) from right, to get min.
        // case 3, if x < b, ans = A, put x bits from left

        int countSetBitsinA = 0;
        for (int i = 0 ; i < 32;i++) {
            if(checkIthSetBit(A,i)) {
                countSetBitsinA++;
            }
        }
        if(countSetBitsinA == B) return A;
        else if(countSetBitsinA > B) {
            int bitsToUnset = countSetBitsinA - B;
            for(int i = 0; i < 31; i++) {
                if(checkIthSetBit(A,i) && bitsToUnset > 0) {
                    A = ~(1 << i) & A;
                    bitsToUnset--;
                }
            }
        }
        else if (countSetBitsinA < B) {
            int bitsToSet = B - countSetBitsinA;
            for(int i = 0; i<32;i++) {
                if(!checkIthSetBit(A,i) && bitsToSet > 0) {
                    A = A | (1 << i);
                    bitsToSet--;
                }
            }
        }
        return A;
    }
    public static boolean checkIthSetBit(int num,int i) {
        // with right shift operator
        // right shift number by i, so that ith bit come at rightmost bit
        int rightShiftedNum = num >> i;
        //perform & with magic number
        num = (rightShiftedNum & 1);
        // if check gives 1, then bit is set , else no
        boolean check = num == 1;
        return check;
    }
}
