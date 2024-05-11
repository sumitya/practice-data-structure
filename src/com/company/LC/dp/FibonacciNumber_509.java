package com.company.LC.dp;

public class FibonacciNumber_509 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        // lets solve using bottom up DP approach
        int first = 0;
        int second = 1;
        for(int i = 2; i <=n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        //return nth fib no.
        return  second;
    }
}
