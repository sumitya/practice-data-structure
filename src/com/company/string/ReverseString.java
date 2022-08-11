package com.company.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(str));
        System.out.println(solve(str).length());
    }
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i = A.length()-1; i >=0; i--){

            if(A.charAt(i) !=' '){
                while(i >=0 && A.charAt(i) !=' '){
                    sb.append(A.charAt(i));
                    i--;
                }
            }
            sb1.append(reverse(sb));
            if(sb1.length() != 0 ){
                sb1.append(" ");
            }
            sb.setLength(0);
        }


        return sb1.toString().trim();
    }
    public static StringBuilder reverse(StringBuilder A) {
        StringBuilder sb = new StringBuilder();
        int j = A.length()-1;
        while(j >=0){
            sb.append(A.charAt(j));
            j--;
        }
        return sb;
    }
}
