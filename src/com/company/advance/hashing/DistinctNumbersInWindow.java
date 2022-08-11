package com.company.advance.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));

        for(Integer ele: dNums(new int[]{1, 2, 1, 3, 4, 3},3)) {
            System.out.println(ele);
        }
    }
    public static int[] dNums(int[] A, int B) {

        HashMap<Integer, Integer> hm = new HashMap();
        //ArrayList<Integer> res = new ArrayList();
        int[] res = new int[A.length-B+1];
        int k = 0;

        for(int i=0; i<B; i++){
            hm.put(A[i],i);
        }

        res[k] = hm.size();
        k++;

        for(int i=1; i<=A.length-B; i++){
            hm.remove(A[i-1],i-1);
            hm.put(A[i+B-1], i+B-1);
            res[k] = hm.size();
            k++;
        }

        return res;
    }
}