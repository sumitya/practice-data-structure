package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;

public class PickBothSides {

    public static void main(String[] args) {
        int[] arr = {-533, -1199, -1699, -1530, -806, -328, 30, -8, -544, 161, -694, -413, -586, 375, -134, -139, 803, 630, 1066, 457, 61, 963, 116, -592, -1210, -789, -1073, -355, 540, 987, 1713, 1484, 2022, 2891, 3803, 4470, 3769, 3804, 4698, 4401, 5212, 5534, 4867, 5540, 5204, 5345, 6056, 5309, 5177, 5724, 6368, 6030, 5787, 4824, 4683, 4406, 5147, 5676, 5454, 4770, 4805};

        int [] A = {5, -2, 3 , 1, 2};
        int B = 3;

        solve(A,B);
    }

    public static int solve(int[] A, int B) {

        int[] APrefix = new int[A.length];
        int[] ASuffix = new int[A.length];

        APrefix[0] = A[0];
        for(int i = 1; i < A.length; i++){
            APrefix[i] = APrefix[i-1] + A[i];}

        ASuffix[A.length-1] = A[A.length-1];
        for(int i = A.length-2; i >= 0; i--){
            ASuffix[i] = ASuffix[i+1] + A[i];}

        ArrayList<Integer> sumArr = new ArrayList<>();

        // base case
        int res = APrefix[B-1];  // 5 -2 3 1 2 // 5 3 6 7 9
        sumArr.add(res);

        for(int i = 1; i <= B; i++){
            int sum = 0;
            int first = B - i - 1;    // 3 -1 -1 , 3-2-1 , 3-3-1
            int last = A.length-i;    // 5 -1 , 5-2 , 5-3

            if(first != -1){sum += APrefix[first];}
            sum += ASuffix[last];

            sumArr.add(sum);
            System.out.println("i => "+i+",first => "+first + ",last => "+last+",A[first] => "+APrefix[first]+",A[last] => "+ASuffix[last]+",sum => "+sum);

        }

        int maxSum = sumArr.get(0);
        for(int sum: sumArr){
            if(maxSum < sum){
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
