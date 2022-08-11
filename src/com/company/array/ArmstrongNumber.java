package com.company.array;

import java.lang.*;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1; i <= number; i++){
            int nTocheck = i;
            while(nTocheck >0){
                int j = nTocheck % 10;
                sum = sum + j*j*j;
                nTocheck = nTocheck/10;
            }
            if(sum == i){
                System.out.println(i);
            }
            sum = 0;
        }
    }
}