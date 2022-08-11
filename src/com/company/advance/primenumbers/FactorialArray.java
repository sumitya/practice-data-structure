package com.company.advance.primenumbers;

import java.util.Arrays;

public class FactorialArray {
    public static void main(String[] args) {
        solve(new int[]{2, 2, 3, 3});
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int mod = 1000000007;
        int maxVal = A[0];
        for(int i = 0; i < A.length; i++)
        maxVal = Math.max(maxVal,A[i]);
        //check isPrime with the help of seive algorithm
        boolean[] isPrime = new boolean[maxVal+1];
        for(int i = 2;i*i<=maxVal;i++){
            if(!isPrime[i]){
                for(int j = i*i;j<=maxVal;j=j+i){
                    isPrime[j] = true;
                }
            }
        }
        //Find primenumberscount in Factorial of element
        //for each prime number : count of values greater than this prime
        // and less than next prime (increase count till next prime exist)
        //eg: 13!, 14!, 15! 16! will have set of primes until it reaches next greater prime
        //so sorting helpes here
        int[] isPrimeCount = new int[maxVal+1];
        for(int i =2;i<=maxVal;i++){
            if(!isPrime[i]){
                isPrimeCount[i] = isPrimeCount[i-1]+1;
            }else{
                isPrimeCount[i] = isPrimeCount[i-1];
            }
        }
        int count = 1;
        if(A[0]<2){
            count =0;
        }
        long sum =0;
        for(int i=0;i<n-1;i++){
            if(isPrimeCount[A[i]] == isPrimeCount[A[i+1]]){
                count++;
            }else{
                sum = (sum + (1<<count) -1)%mod;
                count = 1;
            }
        }
        sum = (sum + (1<<count) -1)%mod;
        return (int)sum;
    }
}
