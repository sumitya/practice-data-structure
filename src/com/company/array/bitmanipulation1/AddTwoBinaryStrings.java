package com.company.array.bitmanipulation1;

import java.nio.charset.StandardCharsets;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String A = "0011";
        String B = "100";
        String str1 = ("00000000000000000000000000000000" + A).substring(A.length());
        String str2 = ("00000000000000000000000000000000" + A).substring(B.length());
        System.out.println(str1);
        System.out.println(str2);
    }
}
