package com.p6_Arrays_Medium;

public class A12_RotateMatixBy90Degree {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrix(matrix);
        for(int arr[] : matrix){
            for(int i :arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] i:matrix){
            swapping(i,0,i.length-1);
        }
    }

    private static void swapping(int[] matrix, int i, int j) {

        while (i<=j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
}
