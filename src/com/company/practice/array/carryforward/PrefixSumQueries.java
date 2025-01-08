package com.company.practice.array.carryforward;


import java.util.Arrays;

public class PrefixSumQueries {
    static int[] inputArr = {1,2,3,4,5,6,7,8,9,10};
    static int[] cumArr = new int[10];
    public static void main(String[] args) {
        buildCumArray(inputArr);
        System.out.println(Arrays.toString(inputArr));
        System.out.println(SumQueries(0,10));
        System.out.println(SumQueries(0,9));
        System.out.println(SumQueries(8,9));
        System.out.println(SumQueries(2,5));

    }
    public static void buildCumArray(int[] inputArr){
        cumArr[0] = inputArr[0];
        for(int i = 1; i < cumArr.length; i++) {
            cumArr[i] = cumArr[i-1] + inputArr[i];
        }
    }
    public static int SumQueries(int s, int e){
        if(s < 0 || e > inputArr.length-1) return 0;
        if(s ==0) return cumArr[e];
        return cumArr[e] - cumArr[s-1];
    }
}
