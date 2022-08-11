package com.company.array.bitmanipulation2;

public class BitCompression {
    public static void main(String[] args) {
        int[] arr = {5, 30, 30, 5, 24, 21, 12, 4, 16, 4, 31 };
        int[] arr1 = {1,3,5}; //
        //compressBits(arr1);
        solve("A");
        "A".substring(0,1).charAt(0);
    }
    public static int compressBits(int[] A) {
        for(int i = 0; i<A.length;i++){
            for(int j = i+1; j<A.length;j++){
                System.out.println("i, j "+i+j);
                System.out.println("A[i], A[j] "+A[i]+A[j]);
                A[i] = A[i] & A[j];
                A[j] = A[i] | A[j];
                System.out.println();

            }
        }
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
        int ans = A[0];
        for(int i = 1; i < A.length;i++){ans = ans ^ A[i];}
        return ans;
    }

public static int solve(String A) {
    int count = 0;
    for(int i = 0 ; i<A.length();i++){
        for(int j = i+1 ; j<A.length();j++){
            if(A.substring(i,j).charAt(0) == 'a' || A.substring(i,j).charAt(0) == 'e'|| A.substring(i,j).charAt(0) == 'i' ||
                    A.substring(i,j).charAt(0) == 'o'|| A.substring(i,j).charAt(0) == 'u' || A.substring(i,j).charAt(0) == 'A' ||
                    A.substring(i,j).charAt(0) == 'E' || A.substring(i,j).charAt(0) == 'I' || A.substring(i,j).charAt(0) == 'O' ||
                    A.substring(i,j).charAt(0) == 'U') {
                count++;
            }
        }
    }
    return count % 10003;
}
}
