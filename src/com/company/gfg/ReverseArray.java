package com.company.gfg;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc!=0){
            int len = sc.nextInt();
            int[] elements = new int[len];
            for(int j = 0 ; j < tc; j++){
                int ele = sc.nextInt();
                elements[j] = ele;
            }
            reverse(elements,elements.length-1);
            tc--;
        }
    }
    public static void reverse(int[] ele, int index){
        System.out.print(ele[index]);
        if(index == 0) return;
        reverse(ele,index-1);
    }
}