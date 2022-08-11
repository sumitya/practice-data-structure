package com.company.array.carrayforward;

import java.util.Arrays;

public class EvenSubArray {
    public static void main(String[] args) {
        int[] arr = {978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940};
        System.out.println(solve(arr));

    }

    public static String solve(int[] A) {

        boolean breakIt = false;

        if (A.length % 2 != 0) return "NO";
        for (int i = 0; i < A.length; i += 2) {

            System.out.println("A[i] => "+A[i]);

            if (A[i/2] % 2 == 0 && A[0] == 0) {

                //breakIt = true;
                //break;
            }
            if(A[i/2] % 2 != 0 && A[0] == 0){
                if(A[(i+1)/2] % 2 == 0){

                }
            }

        }

        if (breakIt) {
            return "NO";
        }
        else{
            return "YES";
        }
    }
}

