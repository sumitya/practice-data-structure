package com.company.array;

import java.lang.*;
import java.util.*;

public class IsPerfect {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int nPositiveInt = sc.nextInt();
        ArrayList<Integer> aInt = new ArrayList<>();

        for(int i= 1;i <= nPositiveInt ; i++){
            aInt.add(sc.nextInt());
        }

        for(Integer oneInt:aInt){

            for(int i = 1; i < oneInt; i++){
                if(oneInt % i == 0){
                    sum = sum + i;
                }
            }

            if(sum==oneInt){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            sum=0;

        }
    }
}