package com.company.advance.heap;

import java.util.Arrays;

public class PercolateDownHeap {
    static int[] heapArr = new int[]{10 ,20, 30, 15, 16, 28, 29, 40};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(creatingMaxHeapOutOfArray(heapArr,7)));

    }
    public static int[] creatingMaxHeapOutOfArray(int[] heapArr,int lastFilledIndex) {
        for(int i = heapArr.length; i >= 0; i--) {
            // here are different roots of subtree
            PercolateDown(heapArr,lastFilledIndex,i);
        }
        return heapArr;
    }
    public static int[] PercolateDown(int[] heapArr, int lastFilledEleInd, int rootSubTree) {
        int index = rootSubTree;
        int maxValue = 0;
        while(true) {
            int leftC = 2 * index;
            int rightC = 2 * index +1;
            if(leftC  > lastFilledEleInd) {
                //both child doesn't exist, you're a leaf
                break;
            }
            if(rightC > lastFilledEleInd) {
                //rightC not available, only rightC exist
                // check the poison
                if(heapArr[index] > heapArr[leftC]) { //solved the poison,
                    break;
                }
                // swap poison with Left children
                int temp = heapArr[index];
                heapArr[index] = heapArr[leftC];
                heapArr[leftC] = temp;
                index = leftC;
            }
            else {
                // both children exist
                //find max index of the child, which needs swap with poison element
                int maxIndex = (heapArr[leftC] > heapArr[rightC]) ? leftC : rightC;
                maxValue = Math.max(heapArr[leftC],heapArr[rightC]);
                if(heapArr[index] > maxValue) {
                    break;
                }
                // swap poison with max value children
                //heapArr[index] , maxValue
                int temp = heapArr[index];
                heapArr[index] = heapArr[maxIndex];
                heapArr[maxIndex] = temp;
                index = maxIndex;
            }
        }
        return heapArr;
    }
}
