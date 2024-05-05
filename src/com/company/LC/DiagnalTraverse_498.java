package com.company.LC;

import java.util.ArrayList;
import java.util.List;

public class DiagnalTraverse_498 {
    //NOT working atm
    static int count = 0;
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 6
        // 7 8 9
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        List<List<Integer>> out = new ArrayList<>();
        ArrayList<Integer> in1 = new ArrayList<>();
        in1.add(1);
        in1.add(2);
        in1.add(3);
        in1.add(4);
        ArrayList<Integer> in2 = new ArrayList<>();
        in2.add(5);
        in2.add(6);
        in2.add(7);
        in2.add(8);
        ArrayList<Integer> in3 = new ArrayList<>();
        in3.add(9);
        in3.add(10);
        in3.add(11);
        in3.add(12);
        ArrayList<Integer> in4 = new ArrayList<>();
        in4.add(13);
        in4.add(14);
        in4.add(15);
        in4.add(16);

        out.add(in1);
        out.add(in2);
        out.add(in3);
        out.add(in4);

        int[] resMatrix = diagonal(out);
        for (int i =0; i< resMatrix.length;i++) {System.out.print(resMatrix[i]+"\n");}

    }
    public static int[] diagonal(List<List<Integer>> nums) {
        ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
        // print top -> down
        int k = 0;
        for(int i = 0; i < nums.size(); i++) {
            int startI = i;
            int startJ = 0;
            resList.add(getDiagnalElementsBottomUp(nums, startI, startJ));
        }
        // print left -> right
        for(int j = 1; j < nums.size();j++) {
            int startI = nums.size() - 1;
            int startJ = j;
            resList.add(getDiagnalElementsBottomUp(nums, startI, startJ));
        }

        //just for printing
        int[] resArr = new int[count];
        int i = 0;
        for(ArrayList<Integer> list : resList) {
            for(Integer in: list){
                resArr[i] = in;
                i++;
            }
        }
        return resArr;
    }
    public static ArrayList<Integer> getDiagnalElementsBottomUp(List<List<Integer>> nums,int start,int end){
        int i = start;
        int j = end;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while(i >= 0 && j <= start) {
            lst.add(nums.get(i).get(j));
            count = count + 1;
            i--;
            j++;
        }
        return lst;
    }
    public static ArrayList<Integer> getDiagnalElementsTopDown(List<List<Integer>> nums,int start,int end){
        int i = start;
        int j = end;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while(i >= end && j <= start) {
            lst.add(nums.get(i).get(j));
            count = count + 1;
            i++;
            j--;
        }
        return lst;
    }

}