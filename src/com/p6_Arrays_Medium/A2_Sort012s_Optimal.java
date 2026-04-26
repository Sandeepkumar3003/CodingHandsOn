package com.p6_Arrays_Medium;

import java.util.Arrays;



public class A2_Sort012s_Optimal {
    public static void main(String[] args) {

        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};


        int[] ans = sortedSolutionOptimal(arr);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortedSolutionOptimal(int[] arr) {
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while (mid<=high){
            if(arr[mid]==0){
                swapNumber(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else if (arr[mid]==2) {
                swapNumber(arr,mid,high);
                high--;
            }
        }
        return arr;
    }

    private static void swapNumber(int[] arr,int i, int j) {

        int temp;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
