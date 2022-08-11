package com.company.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DistintNumberInWindow {
    public static void main(String[] args) {
        int[] aa = {1, 2, 1, 3, 4, 3};
        dNums(aa,3);
    }
    public static int[] dNums(int[] A, int B) {
        // Hashmap<int,int>
        // create 1st window
        // for every window perform -/+ salt.

        if(B > A.length) return new int[0];

        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        // create 1st window
        for(int i = 0 ; i < B;i++){
            if(!hm.containsKey(A[i])){ hm.put(A[i],1);}
            else{ hm.put(A[i],(Integer) hm.get(A[i]) + 1 );}
        }
        al.add(hm.size());

        for(int i = 1 ; i < A.length - B + 1 ;i++){

            // (-)ve salt
            hm.put(A[i-1], hm.get(A[i-1]) - 1);

            if(((Integer) hm.get(A[i-1])) == 0) hm.remove(A[i-1]);

            // (+)ve salt
            if(!hm.containsKey(A[i+B-1])) {hm.put(A[i+B-1],1); }
            else {hm.put(A[i+B-1], hm.get(A[i+B-1])  +1 ); }

            al.add(hm.size());

        }

        // convert arraylist to array
        int[] resArr = new int[al.size()];
        for(int i = 0 ; i < al.size(); i++) { resArr[i] = al.get(i);}

        return resArr;

    }
}
