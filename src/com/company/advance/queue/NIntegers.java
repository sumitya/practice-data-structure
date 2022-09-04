package com.company.advance.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NIntegers {
    public static void main(String[] args) {
        solve(9);
    }
    public static int[] solve(int A) {
        if (A == 1) return new int[]{1};
        if (A == 2) return new int[]{1,2};
        if(A == 3) return new int[]{1,2,3};
        int k = 0;
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[A];
        q.add(1);
        q.add(2);
        q.add(3);
        int N = 3;
        while(N <=A) {
            int no = q.peek();
            res[k] = no;
            q.remove();
            q.add(no*10+1);
            q.add(no*10+2);
            q.add(no*10+3);
            N++;
            k++;
        }
        return res;
    }
}
