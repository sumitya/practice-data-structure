package com.company.array.array2d;

import java.util.ArrayList;
import java.util.List;

public class AntiDignals {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] resArr = diagonal(A);
        for(int i = 0; i< resArr.length;i++){
            for(int j = 0; j< resArr[0].length;j++){
                System.out.print(resArr[i][j]);

            }
            System.out.println();
        }
    }

    public static int[][] diagonal(int[][] A) {
        ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
        // print from left to right
        for(int j = 0; j< A[0].length;j++){
            int startI = 0;
            int startJ = j;
            resList.add(getDignalElements(A,startI,startJ));
        }
        // print from top to bottom
        for(int i = 1; i< A.length;i++){
            int startI = i;
            int startJ = A[0].length-1;
            resList.add(getDignalElements(A,startI,startJ));
        }
        int[][] resArr = new int[resList.size()][];
        for(int i = 0; i< resList.size();i++){
            resArr[i] = new int[A.length];
            for(int j = 0; j< resArr[i].length;j++){
                if(j < resList.get(i).size()){resArr[i][j] = resList.get(i).get(j);}
            }
        }
        return resArr;
    }
    public static ArrayList<Integer> getDignalElements(int A[][],int start,int end){
        int i = start;
        int j = end;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while(i < A.length && j >= 0){
            lst.add(A[i][j]);
            i++;
            j--;
        }
        return lst;
    }
}
