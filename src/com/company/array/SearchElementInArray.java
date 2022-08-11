package com.company.array;

import java.util.Scanner;

public class SearchElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        myLabel: for(int i = 0; i < testCases; i++){
            String[] lines = sc.nextLine().split(" ");
            int[] A = new int[Integer.parseInt(lines[0])];

            for (int j = 1; j <= A.length; j++) {
                A[j-1] = Integer.parseInt(lines[j]);
            }

            int B = Integer.parseInt(sc.nextLine());

            for(int k = 0; k < A.length; k++){
                if(B==A[k]){
                    System.out.println(1);
                    continue myLabel;
                }

            }

            System.out.println(0);

        }
    }
}
