package com.company.advance.stack;

import java.util.Stack;

public class BalanceParan {
    public static void main(String[] args) {
        String str = "(){}[]"; //"{([])}";
        System.out.println(solve(str));
    }
    public static int solve(String A) {
        //
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < A.length(); i++) {
            Character ch = A.charAt(i);
            if(st.size() == 0 && (A.charAt(i) == '}' || A.charAt(i) == ']' || A.charAt(i) == ')')) return 0;
            if(A.charAt(i)=='}' && st.peek() == '{') st.pop();
            if(A.charAt(i)==']' && st.peek() == '[') st.pop();
            if(A.charAt(i)==')' && st.peek() == '(') st.pop();
            if(A.charAt(i) == '{' || A.charAt(i) == '[' || A.charAt(i) == '(') st.push(A.charAt(i));
        }
        if(st.size() == 0) return 1;
        else return 0;
    }
}
