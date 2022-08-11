package com.company.hashing;

import java.util.*;

public class CommonInArray {
    public static void main(String[] args) {
        int[] A = {10, 20, 20, 10};
        int[] B = {3, 2, 1,1, 2};
        //solve(A,B);
    }
    public static int[] solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap hashMapA = new HashMap<Integer,Integer>();
        HashMap hashMapB = new HashMap<Integer,Integer>();

        for(int i = 0; i< A.size();i++){
            if(hashMapA.containsKey(A.get(i))){
                hashMapA.replace(A.get(i),(Integer) hashMapA.get(A.get(i))+1);
            }
            else{
                hashMapA.put(A.get(i),1);
            }
        }
        for(int i = 0; i< B.size();i++){
            if(hashMapB.containsKey(B.get(i))){
                hashMapB.replace(B.get(i),((Integer)hashMapB.get(B.get(i)))+1);
            }
            else{
                hashMapB.put(B.get(i),1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Map.Entry<Integer,Integer>> iterator = hashMapA.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            int key = entry.getKey();
            int value = entry.getValue();

            if(hashMapB.containsKey(key)){
                int minOccur = Math.min(value, (Integer) hashMapB.get(key));
                list.addAll(Collections.nCopies(minOccur,key));
            }
        }


        Iterator<Map.Entry<Integer,Integer>> iteratorA = hashMapA.entrySet().iterator();
        while(iteratorA.hasNext()){
            Map.Entry<Integer, Integer> entry = iteratorA.next();
            System.out.println(entry.getKey() + "\t"+ entry.getValue());
        }
        System.out.println();
        Iterator<Map.Entry<Integer,Integer>> iteratorB = hashMapB.entrySet().iterator();
        while(iteratorB.hasNext()){
            Map.Entry<Integer, Integer> entry = iteratorB.next();
            System.out.println(entry.getKey() + "\t"+ entry.getValue());
        }
        return new int[1];
    }
}
