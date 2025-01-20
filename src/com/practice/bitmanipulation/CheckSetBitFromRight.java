package com.practice.bitmanipulation;

import static java.lang.System.out;

public class CheckSetBitFromRight {
    public static void main(String[] args) {
        int Number = 4; //0000100 - binary representation
        System.out.println(checkIthSetBitWithLeftShift(4,2));
        System.out.println(checkIthSetBitWithRightShift(4,2));
    }
    public static boolean checkIthSetBitWithLeftShift(int num,int i) {
        // with left shift operator
        // create magic number
        int magicNum = 1 << i;
        //perform & with magic number
        num = (num & magicNum);
        // if check gives 1, then bit is set , else no
        boolean check = num == 1;
        return check;
    }

    public static boolean checkIthSetBitWithRightShift(int num,int i) {
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
