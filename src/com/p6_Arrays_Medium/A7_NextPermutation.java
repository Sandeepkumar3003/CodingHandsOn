package com.p6_Arrays_Medium;

import java.util.Arrays;

public class A7_NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1,0,0};
        int[] ans = nextPermutaionArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextPermutaionArray(int[] arr) {
        int n = arr.length;
        int index =-1;
        for (int i = n-2; i>=0 ; i--) {
            if(arr[i]<arr[i+1]){
                index = i;
                break;

            }
        }
//        System.out.println(Arrays.toString(arr)+" "+index+ " "+ arr[index]);

        if(index==-1){
            swapArray(arr,0,n-1);
            return arr;
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        swapArray(arr,index+1,n-1);

        return arr;
    }

    private static void swapArray(int[] arr, int i, int j) {
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
