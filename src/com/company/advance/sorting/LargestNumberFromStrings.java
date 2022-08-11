package com.company.advance.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromStrings {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        String[] strArr = new String[A.length];
        for(int i = 0 ; i < A.length; i++) {
            strArr[i] = Integer.toString(A[i]);
        }
        Arrays.sort(strArr,new Comparator<String>(){
            public int compare(String a, String b)
            {
                String o1 = a+b;
                String o2 = b+a;
                return o2.compareTo(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strArr.length; i++) sb.append(strArr[i]);
        return sb.toString();
    }
}

