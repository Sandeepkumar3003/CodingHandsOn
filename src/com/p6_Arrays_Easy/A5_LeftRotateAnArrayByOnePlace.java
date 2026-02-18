package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A5_LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        
        int[] ans = rotatedArray(arr);
        System.out.print(Arrays.toString(ans));
    }

    private static int[] rotatedArray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i <arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        return arr;
    }

}
