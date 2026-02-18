package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A6_LeftRotateAnArrayByDplaces_Brute {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int d = 2;

        int[] rotated = rotatedBrute(arr,d);
        System.out.println(Arrays.toString(rotated));
    }

    private static int[] rotatedBrute(int[] arr, int d) {
        int n = arr.length;

        d = d % n;
        int[] temp = new int[d];
        for (int i=0;i<d; i++){
            temp[i] = arr[i];
        }

        for (int j=d;j<n;j++){
            arr[j-d] = arr[j];
        }

        for(int k=n-d;k<n;k++){
            arr[k] = temp[k-n+d];
        }

        return arr;
    }
}
