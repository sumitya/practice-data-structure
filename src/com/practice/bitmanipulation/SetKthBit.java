package com.practice.bitmanipulation;

public class SetKthBit {
    public static void main(String[] args) {
        // 4 (0100 binary number)
        System.out.println(setKthBit(4,1));
    }
    public static int setKthBit(int num,int i) {
        // create a magic number with ith bit set
        int magicNum = (1 << i);
        // perform bitwise OR with magic number
        return num | magicNum;
    }
}
