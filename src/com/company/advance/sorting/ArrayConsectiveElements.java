package com.company.advance.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConsectiveElements {
    public static void main(String[] args) {
        solve(new int[]{1,2,3,4,5});
        Scanner sc = new Scanner(System.in);
        //Arrays.sort();
    }
    public static int solve(int[] A) {
        //sort the array first
        for(int k=1; k <=A.length; k++) {
            for(int i=0; i <A.length-k; i++) {
                System.out.println(A[i]);
                if(A[i] > A[i+1]) {
                    int temp = A[i+1];
                    A[i+1] = A[i];
                    A[i+1] = temp;
                }
            }
        }
        int matchEle = A[0];
        for(int j = 0 ; j < A.length;j++) {
            if(A[j] != matchEle) return 0;
            matchEle++;
        }
        return 1;
    }
}

