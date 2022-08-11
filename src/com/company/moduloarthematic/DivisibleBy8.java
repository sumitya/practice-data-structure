package com.company.moduloarthematic;

public class DivisibleBy8 {

    public static void main(String[] args) {
        solve("1");
        int res = "1".charAt(0) - '0';
    }
    public static int solve(String A) {
        int j = 0;
        int number = 0;
        if(A.length() < 3) {
            int  i = A.length()-1;
            while(i >= 0){
                int ch = Character.getNumericValue(A.charAt(i));
                number = (int)(number + ch * Math.pow(10,j));
                j++;
                i--;
            }
            if(number % 8 == 0) return 1;
            else return 0;
        }
        for(int i = A.length()-1; i >= A.length()-3;i--){
            System.out.println(A.charAt(i));
            int ch = Character.getNumericValue(A.charAt(i));
            number = (int) (number + ch * Math.pow(10,j));
            System.out.println(number);
            j++;
        }
        System.out.println(number);
        if(number % 8 == 0) return 1;
        else return 0;
    }
}
