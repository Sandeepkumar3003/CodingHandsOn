package com.p6_Arrays_Easy;

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr ={1,2,3,0,0,4,0,5,0,3,0,4,7};
        int[] ans = movedZeros(arr);
        System.out.print(Arrays.toString(ans));
    }

    private static int[] movedZeros(int[] arr) {
        int i=0,j=0;
        int n = arr.length;
        while (i<n && j<n){
            if(arr[i]!=0){
                i++;
                j++;
            }
            else{
                if(arr[j]!=0){
                    arr[i] = arr[j];
                    j++;
                }
            }i++;
            j++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
