package com.company.contest;

public class NoMoreZeros {
    public static void main(String[] args) {
        System.out.println(solve(3999));
    }
    public static String solve(int A) {
        int count =0;
        int temp = A;
        while(temp!=0) {
            if(temp%10 == 9) count++;
            temp = temp/10;
        }
        if(A <= 8) return A+1+"";
        if(count==1) return A+1+1+""; //(A +1) % 10 ==0 &&
        if(count==2) return A+1+11+"";//(A +1) % 10 ==0 &&
        if(count==3) return A+1+111+"";//(A +1) % 10 ==0 &&
        if(count==4) return A+1+1111+""; //(A +1) % 10 ==0 &&
        if(count==5) return A+1+11111+"";//(A +1) % 10 ==0 &&
        if(count==6) return A+1+111111+""; //(A +1) % 10 ==0 &&
        if(count==7) return A+1+1111111+""; //(A +1) % 10 ==0 &&
        if(count==8) return A+1+11111111+""; //(A +1) % 10 ==0 &&
        else return A + 1+"";
    }
}

