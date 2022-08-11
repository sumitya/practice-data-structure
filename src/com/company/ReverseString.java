package com.company;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solve("Hello"));
    }
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();
        int j = A.length() -1;
        int i = 1;
        while(j >=0){
            System.out.println(A.charAt(j));
            sb.append(A.charAt(j));
            j--;
            i++;
        }
        return sb.toString();
    }
}
