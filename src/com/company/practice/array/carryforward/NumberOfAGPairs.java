package com.company.practice.array.carryforward;

public class NumberOfAGPairs {
    static char[] inputArr = {'g','a','g','a','g','g','a','g'};
    static int[] cumArr = new int[8];
    static int ans;
    public static void main(String[] args) {
        buildSuffixArr(inputArr);
        System.out.println(findNumberOfPairs());
    }
    public static void buildSuffixArr(char[] inputArr){
        if(inputArr[inputArr.length-1] == 'a') cumArr[cumArr.length-1] = 0;
        else cumArr[cumArr.length-1] = 1;
        for(int i = cumArr.length-2; i >= 0; i--) {
            if(inputArr[i] == 'g') {
                cumArr[i] = cumArr[i+1] + 1;
            }
            else cumArr[i] = cumArr[i+1];
        }
    }

    public static int findNumberOfPairs() {
        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i] == 'a') {
                ans = ans + cumArr[i];
            }
        }
        return ans;
    }

}
