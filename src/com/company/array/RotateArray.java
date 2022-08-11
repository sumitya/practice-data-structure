package com.company.array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int B = sc.nextInt();
        int[] A = new int[Integer.parseInt(lines[0])];

        B = B % A.length;

        for (int i = 1; i <= A.length; i++) {
            A[i-1] = Integer.parseInt(lines[i]);
        }

        reverse(A,0,A.length-B-1);
        reverse(A,A.length-B,A.length-1);
        reverse(A,0,A.length-1);

        for(int k = 0; k <=  A.length-1; k++){

            System.out.print(A[k]+" ");

        }

        // 1 2 3 4  -> 1 2 4 3 --> 2 1 4 3 --> 3 4 1 2
        // 1 2 3 4 5 -> 1 2 3 5 4 -> 3 2 1 5 4 -> 4 5 1 2 3
        // reverse last k - 4 3
        // reverse remaining - 2 1
        // reverse all array

    }

    public static void reverse(int[] A,int start, int end){

        while(start<=end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }

    }
}
