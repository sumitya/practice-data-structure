package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayMultipleTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] Astr = sc.nextLine().split(" ");
        String[] Bstr = sc.nextLine().split(" ");
        int[] A = new int[Astr.length];
        int[] B = new int[Bstr.length];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(Astr[i]);
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(Bstr[i]);
        }

        ArrayList<int[]> arrayList = new ArrayList<>();
        int[][] twoDArr = new int[B.length][];
        for(int i=0; i< B.length ;i++){
            B[i] = B[i] % A.length;
            int[] AMod = new int[A.length];

            for (int j = 0; j < A.length; j++) {
                AMod[j] = A[j];
            }

           reverse(AMod,0,B[i]-1);
            reverse(AMod,B[i],A.length-1);
            //arrayList.add(reverse(AMod,0,A.length-1));
            twoDArr[i] = reverse(AMod,0,A.length-1);

        }

        System.out.print("[");
        for (int[] arr:arrayList) {
            System.out.print(Arrays.toString(arr));
        }
        System.out.print("]");
    }

    public static int[] reverse(int[] A,int start, int end){
        while(start<=end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }
}
