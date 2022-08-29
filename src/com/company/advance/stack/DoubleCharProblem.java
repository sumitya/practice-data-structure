package com.company.advance.stack;

import java.util.HashMap;
import java.util.Stack;

class Pair {
    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}
public class DoubleCharProblem {
    public static void main(String[] args) {
        String A = "cddfeffe";//"abccbc";
        System.out.println(solve(A));

    }

    public static String solve(String A) {
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (st.size() !=0 && A.charAt(i) == st.peek().ch) {
                st.push(new Pair(A.charAt(i), st.pop().freq + 1));
                if (st.peek().freq == 2) st.pop();
            } else {
                st.push(new Pair(A.charAt(i), 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            System.out.println(p.ch);
            sb.append(p.ch);
        }
        return sb.toString();
    }
}
