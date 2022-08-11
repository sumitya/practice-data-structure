package com.company.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] A) {

        String tempStr = "";
        for(int i = 0; i< A.length-1;i++){
            String str1 = A[i];
            String str2 = A[i+1];
            StringBuilder sb = new StringBuilder();
            int strLen = str1.length() < str2.length() ? str1.length() : str2.length();
            for(int j = 0; j < strLen;j++) {
                if(str1.charAt(j) == str2.charAt(j)) {
                    sb.append(str1.charAt(j));
                }
                else break;
                if(tempStr.length() < sb.toString().length()) tempStr = sb.toString();
            }
        }
        return tempStr;
    }
}
