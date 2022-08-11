package com.company.advance.primenumbers;

import java.io.*;
import java.util.*;
class PrintSubSequence{
    public static void printSubsequences(int[] arr, int index,ArrayList<Integer> path){
        if (index == arr.length){
            if (path.size() > 0)
                System.out.println(path);
        }
        else{
            System.out.println("before call1");
            printSubsequences(arr, index + 1, path);
            System.out.println("after call1");
            path.add(arr[index]);
            System.out.println("before call2");
            printSubsequences(arr, index + 1, path);
            System.out.println("after call2");
            path.remove(path.size() - 1);
        }
        return;
    }
    public static void main(String[] args){
        //int[] arr = { 2, 6, 2, 6 };
        int[] arr = { 2, 6, 2};
        ArrayList<Integer> path = new ArrayList<>();
        printSubsequences(arr, 0, path);
    }
}
