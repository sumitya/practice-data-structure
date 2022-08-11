package com.company.array;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Solution {

    public static void main(String []args){
        System.out.println(solve(100000000));
    }
    public static int solve(int A) {

        for(int i = 1;  i * i <= A ; i++) {
            if(i*i == A){
                return i;
            }
        }
        return -1;
    }
}