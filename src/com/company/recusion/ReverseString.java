package com.company.recusion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //SUMIT
        // T
        // I
        // M
        // U
        // S
        //printStr("SUMIT");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printStr(str);
    }
    public static void printStr(String str){
        if(str.length() >0) {
            System.out.print(str.charAt(str.length() - 1));
            printStr(str.substring(0, str.length() - 1));
        }
    }
}
