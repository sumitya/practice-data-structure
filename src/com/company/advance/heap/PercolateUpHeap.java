package com.company.advance.heap;

import java.util.Arrays;

public class PercolateUpHeap {
    static int[] heapArr = new int[5];
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addElementToHeap(heapArr,0,10)));
        System.out.println(Arrays.toString(addElementToHeap(heapArr,1,2)));
        System.out.println(Arrays.toString(addElementToHeap(heapArr,2,20)));
        System.out.println(Arrays.toString(addElementToHeap(heapArr,3,30)));
    }
    //TC of this function: O(NlogN)
    static int[] addElementToHeap(int[] heapArr, int lastIndex, int valElement) {
        int newIndex = lastIndex+1;
        heapArr[newIndex] = valElement;

        //absorb the impurity
        return PercolateUp(heapArr,newIndex);
    }
    // TC of this function: O(H) - height of the tree
    static int[] PercolateUp(int[] heapArr, int indexOfImpurity) {
        while(indexOfImpurity > 1) {
            int parent = heapArr[(int)Math.floor(indexOfImpurity/2)];
            // if the parent is greater than impurity then minHeap is already formed, break from loop
            if(parent < heapArr[indexOfImpurity]) {
                break;
            }
            //swap the impurity with parent
            int temp = heapArr[indexOfImpurity];
            heapArr[indexOfImpurity] = parent;
            heapArr[(int)Math.floor((double) indexOfImpurity /2)] = temp;
            indexOfImpurity = (int)Math.floor(indexOfImpurity/2);
        }
        return heapArr;
    }

}
