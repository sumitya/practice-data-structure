package com.practice.bitmanipulation;

public class FlipKthBit {
    public static void main(String[] args) {
        System.out.println(flipKthBit(4,0));
    }
    public static int flipKthBit(int num,int i) {
        // create a magic number with ith bit set
        int magicNum = (1 << i);
        // perform bitwise XOR with magic number
        return num ^ magicNum;
    }
}
