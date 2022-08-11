package com.company.subset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllSubSets {
    public static void main(String[] args) {
        ArrayList<Integer> lst =  new ArrayList<>();
        lst.add(12);
        lst.add(13);
        subsets(lst);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);

        int size = A.size();
        int totalBinary = (int)Math.pow(2,size);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //int[][] result = new int[totalBinary][];
        for(int i = 0; i < totalBinary; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < A.size(); j++){
                if(checkSetBit(i,j) == true) temp.add(A.get(j));
            }
            result.add(temp);
        }
        //Arrays.sort(result, (a, b) -> Integer.compare(b[0], a[0]));

        /*Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return a.get(0).compareTo(b.get(0));
            }
        });*/
        return result;
    }
    public static boolean checkSetBit(int N,int bitPos){
        if(((N >> bitPos) &1) == 1) return true;
        else return false;
    }
}