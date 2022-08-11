package com.company.array.carrayforward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {

    static ArrayList<Integer> leadersList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(Arrays.toString(solve(arr)));
    }

    public static int[] solve(int[] A) {

        List<Integer> leadersList = new ArrayList<Integer>();

        leadersList.add(A[A.length-1]);

        int[] leaders = new int[A.length];
        leaders[0] = A[A.length-1];
        int index = 1;

        for(int i = 0; i < A.length - 1; i++){
            boolean breakIt = false;
            for(int j = i+1; j < A.length; j++){
                if(A[i] > A[j]){
                    continue;
                }
                else{
                    breakIt = true;
                    break;
                }
            }
            if(!breakIt){
                leadersList.add(A[i]);
                leaders[index] = A[i];
                index +=1;
            }
        }

        int[] arr = new int[leadersList.size()];

        for (int i = 0; i < leadersList.size(); i++)
            arr[i] = leadersList.get(i);

        return arr;

    }
}
