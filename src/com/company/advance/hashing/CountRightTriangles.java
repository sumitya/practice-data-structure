package com.company.advance.hashing;

import java.util.HashMap;

public class CountRightTriangles {
    public static void main(String[] args) {

    }
    public int solve(int[] A, int[] B) {
        long mod = 1000000007;
        HashMap<Integer, Integer> mapX = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> mapY = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++) {
            mapX.put(A[i], mapX.getOrDefault(A[i], 0)+1);
            mapY.put(B[i], mapY.getOrDefault(B[i], 0)+1);
        }
        long res = 0;
        for(int i=0; i<B.length; i++) {
            res = (
                    (res + (1L*( mapX.get(A[i] )-1 )*( mapY.get(B[i])-1) )% mod )
                            % mod
            );
        }
        return (int)res;
    }
}
