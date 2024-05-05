package com.company.LC;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix_54 {
    public static void main(String[] args) {
        List<Integer> res = spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for(Integer i: res) {
            System.out.print(res+"\t");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        List<Integer> ansList = new ArrayList<>();
        int rowMin = 0;
        int colMin = 0;
        int rowMax = totalRows - 1;
        int colMax = totalCols - 1;

        int j = -1;

        while(rowMin <=rowMax && colMin <=colMax) {
            // go right
            j = colMin;
            while(j <=colMax){
                ansList.add(matrix[rowMin][j]);
                j++;
            }
            rowMin++;

            // go down
            j = rowMin;
            while(j <=rowMax){
                ansList.add(matrix[j][colMax]);
                j++;
            }
            colMax--;

            // go left
            j = colMax;
            if(rowMin <=rowMax) {
            while(j >=colMin){
                ansList.add(matrix[rowMax][j]);
                j--;
            }
            rowMax--;
            }
            // go up
            j = rowMax;
            if(colMin <=colMax) {
                while (j >= rowMin) {
                    ansList.add(matrix[j][colMin]);
                    j--;
                }
                colMin++;
            }
        }

        return ansList;
    }
}