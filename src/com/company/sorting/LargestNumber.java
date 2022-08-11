package com.company.sorting;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {

    }

}

/*public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        return solve(A);
    }
    public String solve(int[] A){
        int n = A.length;
        StringBuilder sb = new StringBuilder();

        Integer[] toSort = new Integer[A.length];
        for(int i = 0; i<A.length;i++) toSort[i] = A[i];

        Arrays.sort(
                toSort, (a,b) -> {
                    String ab = "" + a + b;
                    String ba = "" + b + a;
                    return ba.compareTo(ab);
                }
        );
        for(int i = 0; i< A.length; i++) sb.append(toSort[i]);

        return sb.toString();
    }
}*/

