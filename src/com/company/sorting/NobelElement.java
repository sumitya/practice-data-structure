package com.company.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobelElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(5);
        A.add(6);
        A.add(2);

        solve(A);
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        int ans = 0;
        int less = 0;

        if(A.get(0)==0) ans++;

        for(int i = 1; i< A.size();i++){
            System.out.println(A.get(i));
            if(A.get(i) !=A.get(i-1)) less = i;
            if(less == A.get(i)) ans++;
            System.out.println(ans);
        }
        if(ans >1) return 1;
        return -1;
    }
}
