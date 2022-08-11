package com.company.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LargestSubArrayZeroSum {
    public static void main(String[] args) {
        int[] A = {1, 2, -2, 4, -4};
        int[] B = {1, 2, -2, 4, -4};
        lszero(B);
    }
public static int[] lszero(int[] A) {
    int maxDiff = Integer.MIN_VALUE;
    long sum = 0;
    int maxStart = -1;
    int maxEnd = -1;
    HashMap<Long, Integer> hm = new HashMap<>();
    long[] ps = new long[A.length];
    ps[0] = A[0];
    for(int i = 1;i <A.length;i++){
        ps[i] = ps[i-1] + A[i];
    }
    for(int i = 0; i<A.length;i++){hm.put(ps[i], i);}
    System.out.println(Arrays.toString(ps));
    Iterator it = hm.entrySet().iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    for(int i = 0; i<A.length;i++){
        if(hm.containsKey(ps[i])) {
            int endIndex = hm.get(ps[i]);
            int startIndex = i;
            int diff = endIndex - startIndex;
            if(maxDiff < diff) {
                if(maxStart < i) {
                    maxDiff = diff;
                    maxStart = startIndex +1;
                    maxEnd = endIndex;
                }
            }
        }
    }
    System.out.println("maxStart = >"+ maxStart + "maxEnd => " + maxEnd);
    int k = 0;
    int[] resultArr = new int[maxEnd - maxStart +1];
    for(int i = maxStart; i <= maxEnd ; i++) {resultArr[k] = A[i]; k++;}
    System.out.println(Arrays.toString(resultArr));
    return resultArr;
}
}
