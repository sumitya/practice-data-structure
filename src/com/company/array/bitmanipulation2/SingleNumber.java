package com.company.array.bitmanipulation2;

public class SingleNumber {
    public static void main(String[] args) {
        int[] A = {186,256, 102, 377, 186, 377};
        int[] res = solve(A);
        for(int i = 0; i< res.length;i++)System.out.println(res[i]);
        System.out.println(93 &(1<<5));
    }
    public static int[] solve(int[] A) {

        int[] resultInt = new int[2];
        int answer = A[0];
        int j = 0;
        for(int i = 1; i< A.length;i++){
            answer = answer ^ A[i];
            System.out.println("answer => "+ answer + "A[i] => " + A[i]);
            if(answer != 0){
                resultInt[j] = answer;
            }
        }
        return resultInt;
    }
}
