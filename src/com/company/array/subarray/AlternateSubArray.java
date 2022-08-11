package com.company.array.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternateSubArray {
    public static void main(String[] args) {
        int[] A = { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1 };
        int B = 1;

        int[] A1 = { 1,0,1,0,1};
        int B1 = 1;
        System.out.println(Arrays.toString(solve(A,B)));
    }

    public static int[] solve(int[] A, int B) {

        List<Integer> indexArr = new ArrayList<>();
        int seqLength = 2 * B + 1;
        int seqMid = seqLength/2;

        if(seqMid < 1){
            for(int i = 0;i < A.length ; i++){
                indexArr.add(i);
            }

            int[] resArr = new int[indexArr.size()];
            for (int i = 0; i < indexArr.size(); i++){ resArr[i] = indexArr.get(i);}

            return resArr;

        }

        for(int i = 0;i < A.length ; i++){

            int currSeqLength = 0;
            int preValue = Integer.MIN_VALUE;
            for(int j = i ; j< A.length; j++){

                currSeqLength +=1;

                System.out.println("preValue=>"+preValue+" Current value A[j] => "+A[j]);
                if(preValue == A[j]){ break;}  else{ preValue = A[j];}
                System.out.print("A[j] => "+A[j]+"  ");
                //System.out.print("currSeqLength => "+currSeqLength+"seqLength =>"+seqLength+"  ");
                if(currSeqLength == seqLength){
                    int res =  (i + j)/2;
                    System.out.println("res => "+res);
                    indexArr.add(res);
                    break;
                }

            }
            System.out.println();
        }

        int[] resArr = new int[indexArr.size()];
        for (int i = 0; i < indexArr.size(); i++){ resArr[i] = indexArr.get(i);}
        return resArr;
    }
}
