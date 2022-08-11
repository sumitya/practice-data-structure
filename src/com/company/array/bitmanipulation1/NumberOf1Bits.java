package com.company.array.bitmanipulation1;

public class NumberOf1Bits {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(numSetBits(450676354)); //450676354
        //System.out.println(1/2);
        //System.out.println(1%2);
    }
    public static int numSetBits(int A) {

        int quotient = A/2;
        int reminder = A%2;
        while(quotient >0){
            //System.out.println(quotient);   15/2 =7 , 7/2=3 , 3/2 = 1 , 1/2 = 0
            //System.out.print("quotient => "+quotient);
            if(reminder ==1) System.out.print("reminder => "+reminder);
            if(reminder ==1) count +=1;
            reminder = quotient % 2;
            quotient = quotient / 2;

        }
        System.out.println();
        //System.out.print("quotient => "+quotient);
        System.out.print("reminder => "+reminder);
        if(reminder ==1) count +=1;
        System.out.print("count => "+count);
        return count;
    }
}
