package com.company.array;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");

        int[] A = new int[Integer.parseInt(lines[0])];

        for (int i = 1; i <= A.length; i++) {
            A[i-1] = Integer.parseInt(lines[i]);
        }

        int max = A[0];
        int min = A[0];

        for(int j = 0; j< A.length; j++){
            if(max < A[j]){
                max = A[j];
            }
        }

        for(int k = 0; k< A.length; k++){
            if(min > A[k]){
                min = A[k];
            }
        }

        System.out.println(max+" "+min);
    }
}
