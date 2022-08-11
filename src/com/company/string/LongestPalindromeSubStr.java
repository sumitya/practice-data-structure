package com.company.string;

public class LongestPalindromeSubStr {
    public static void main(String[] args) {

    }
    private String expand(String s, int i, int j){
        while(i>=0 && j< s.length() ){
            if(s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            } else
                break;
        }
        return s.substring(i+1, j);
    }
    public String longestPalindrome(String A) {
        String ans = "";
    //odd length palindrome expand from i=j
        for(int i=0; i<A.length(); i++){
            String t = expand(A, i, i);
            if(ans.length() < t.length()){
                ans = t;
            }
        }

    //even length palindrome expand from i, i+1
        for(int i=0; i<A.length()-1; i++){
            String t = expand(A, i, i+1);
            if(t.length() > ans.length()){
                ans = t;
            }
        }
        return ans;
    }
}

