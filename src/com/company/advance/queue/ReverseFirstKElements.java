package com.company.advance.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        solve(A,B);
    }
    public static int[] solve(int[] A, int B) {
        Queue<Integer> qu1  = new LinkedList<>();
        Queue<Integer> qu2  = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<A.length; i++) qu1.add(A[i]);
        for(int i = 0; i<B;i++) {
            int no = qu1.peek();
            qu1.remove();
            st.add(no);
        }
        while(st.size()!=0) {
            qu2.add(st.pop());
        }
        while(!qu1.isEmpty()) {
            int no = qu1.peek();
            qu1.remove();
            qu2.add(no);
        }
        int[] res = new int[qu2.size()];
        int k = 0;
        while(!qu2.isEmpty()) {
                int no = qu2.peek();
                qu2.remove();
                res[k] = no;
                k++;
        }
        return res;
    }
}
