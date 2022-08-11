package com.company.advance.primenumbers;

public class LuckyNumber {
    public static void main(String[] args) {
        solve(8);
    }
    public static int solve(int A) {
        return getLucklyNumber(A);
    }
    public static int getLucklyNumber(int A){
        //Method to generate primefactors upto given number A
        int ans=0;
        int[] prime = new int [A+1];
        for (int i=2;i<=A;i++){
            if(prime[i]==0){
                for (int j=i;j<=A;j=j+i){
                    prime[j]++;
                }
            }
        }
        //iterate over prime factors array and check if prime count ==2;
        for(int a: prime){
            if (a==2){
                ans++;
            }
        }
        return ans;
    }
}
