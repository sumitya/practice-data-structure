package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i = 0; i< T; i++){

            //setup
            int L = Integer.parseInt(sc.nextLine());
            String[] lines = sc.nextLine().split(" ");
            int[] A = new int[L];
            for (int j = 0; j < A.length; j++) {A[j] = Integer.parseInt(lines[j]);}

            // get the even/odd arrays
            ArrayList<Integer> oddArr = new ArrayList<>();
            ArrayList<Integer> evenArr = new ArrayList<>();

            for(int k = 0;k< A.length; k++){
                if(Math.abs(A[k]) % 2 == 0){evenArr.add(A[k]);}
                else{oddArr.add(A[k]);}
            }

            for(int e: oddArr){System.out.print(e+" ");}
            System.out.println();
            for(int e: evenArr){System.out.print(e+" ");}
            System.out.println();
        }
    }
}
