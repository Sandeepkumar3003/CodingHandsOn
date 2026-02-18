package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A6_LeftRotateAnArrayByDplaces_Optimal {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {-1,-100,3,99};
        System.out.println(Arrays.toString(arr));
        int d = 2;

        int[] rotated = rotated(arr,d);
        System.out.println(Arrays.toString(rotated));
    }

    private static int[] rotated(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        d = n- d;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        return arr;

    }

    private static int[] reverse(int[] arr, int start, int end) {
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
