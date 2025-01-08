package com.company.LC.array2d;

class SpiralMatrix_59 {
    public static void main(String[] args) {
        int[][] res = generateMatrix(9);

    }
    public static int[][] generateMatrix(int A) {
        int[][] spiralMatrix = new int[A][A];
        int total = A * A;
        int rowMin = 0;
        int rowMax = A - 1;
        int colMin = 0;
        int colMax = A -1;
        int j = -1;
        int element = 1;

        while(element <=total) {
            // go right
            j = colMin;
            while(j <=colMax && areElementsDone(element,total)){
                spiralMatrix[rowMin][j] = element;
                j++;
                element++;
            }
            rowMin++;

            // go down
            j = rowMin;
            while(j <=rowMax && areElementsDone(element,total)){
                spiralMatrix[j][colMax] = element;
                j++;
                element++;
            }
            colMax--;

            // go left
            j = colMax;
            while(j >=colMin && areElementsDone(element,total)){
                spiralMatrix[rowMax][j] = element;
                j--;
                element++;
            }
            rowMax--;

            // go up
            j = rowMax;
            while(j >=rowMin && areElementsDone(element,total)){
                spiralMatrix[j][colMin] = element;
                j--;
                element++;
            }
            colMin++;

        }

        return spiralMatrix;
    }
    public static boolean areElementsDone(int ele, int total){
        return ele <=total;
    }
}