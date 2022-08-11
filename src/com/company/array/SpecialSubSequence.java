package com.company.array;

import java.util.Arrays;

public class SpecialSubSequence {
    public static void main(String[] args) {
        String pattern = "GGGTGANAGGJGAG";
        String pattern1 = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        String pattern2 = "AAEYETGGA";
        System.out.println(solve(pattern2));
    }

    public static int solve(String A) {

        int[] ASufix = new int[A.length()];
        int M = 1000000007;

        if(A.charAt(A.length()-1) == 'G') {ASufix[A.length()-1] = 1;}
        else{ASufix[A.length()-1] = 0;}
        for(int i = A.length()-2; i>= 0; i--){
            if(A.charAt(i) == 'G'){
                ASufix[i] = ASufix[i+1] + 1;
            }
            else{ASufix[i] = ASufix[i+1];}
        }

        System.out.println(Arrays.toString(ASufix));

        int count = 0;
        for(int i = 0; i < A.length()-1; i++){
            if(A.charAt(i) == 'A'){
                count +=ASufix[i];
            }
        }

        //int res = count % M;
        return count % M;
    }
}
