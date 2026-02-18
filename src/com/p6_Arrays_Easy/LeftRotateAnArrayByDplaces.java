package com.p6_Arrays_Easy;

import java.util.Arrays;

public class LeftRotateAnArrayByDplaces {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int k = 3;
//
//        int[] ans = rotateByUsingTempArray(arr,k);
//        System.out.print(Arrays.toString(ans));


        int[] ans2 = rotateByReversing(arr,k);
        System.out.print(Arrays.toString(ans2));
    }

    public static int[] reverse(int[] arr,int start, int end){

        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }
    private static int[] rotateByReversing(int[] arr, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        return arr;

    }

    private static int[] rotateByUsingTempArray(int[] arr,int k) {
        int[] temp = new int[k];
        int n = arr.length;
        k = k % n;
        int i=0;
        while (i<k){
            temp[i] = arr[i];
            i++;
        }

        int j = k;
        while(j<n){
            arr[j-k] = arr[j];
            j++;
        }

        int m=n-k;
        int z=0;
        while (m<n){
            arr[m] = temp[z];
            m++;
            z++;
        }

        return arr;



    }
}
