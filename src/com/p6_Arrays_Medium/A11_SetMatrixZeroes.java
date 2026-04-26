package com.p6_Arrays_Medium;

import java.util.Arrays;

public class A11_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1}
                         ,{1,0,0,1},
                          {1,1,0,1},
                          {1,1,1,1}};

        markedZerosMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void markedZerosMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    matrixRow(matrix,i,m);
                    matrixColumn(matrix,j,n);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

    }

    private static void matrixColumn(int[][] matrix,int j,int n) {
        for (int i = 0; i < n; i++) {
            matrix[i][j] = -1;
        }
    }


    private static void matrixRow(int[][] matrix,int i, int m) {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = -1;
        }
    }



}
