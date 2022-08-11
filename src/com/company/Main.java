package com.company;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String row1 = str.substring(0,3);
        String row2 = str.substring(3,6);
        String row3 = str.substring(6,9);
        System.out.println("---------");

        System.out.println("| "+str.substring(0,1)+" "+str.substring(1,2)+" "+str.substring(2,3)+" "+" |");
        System.out.println("| "+str.substring(3,4)+" "+str.substring(4,5)+" "+str.substring(5,6)+" "+" |");
        System.out.println("| "+str.substring(6,7)+" "+str.substring(7,8)+" "+str.substring(8,9)+" "+" |");
        System.out.println("---------");
    }
}
