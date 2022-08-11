package com.company.array.bitmanipulation1;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverse(3));
        //String str = String.format("%0"+A.length()+"d", B);

    }

    public static long reverse(long a) {
        long ans = 0;
        for(int i =0; i< 32;i++){
            if((a & (1 << i) ) == 1){
                ans = ans | 1 << (31-i);
            }

        }
        return ans;
    }
}
