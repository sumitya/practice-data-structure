package com.company.array.bitmanipulation2;

public class HelpFromSam {
    public static void main(String[] args) {
        solve(4);
    }
    public static int solve(int A) {
        int count = 0;
        for(int i = 0;i <= 31;i++){
            System.out.println((A & (1 << i)));
            if((A & (1 << i)) != 1){ count = count + 1; }
            int a = -5 % 4;
        }
        return count;
    }
}
