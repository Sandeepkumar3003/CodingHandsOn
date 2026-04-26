package com.p6_Arrays_Medium;

import java.util.Arrays;

public class A6_RearrangeArrayElementBySIgn_OptimalApproach1 {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,-2,4,-6};

        int[] ans = rearrangeArrayOptimal(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rearrangeArrayOptimal(int[] arr) {
        int[] ans = new int[arr.length];
        int positiveIndex =0;
        int negativeIndex = 1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>0){
                ans[positiveIndex]=arr[i];
                positiveIndex = positiveIndex+2;
            }else{
                ans[negativeIndex] = arr[i];
                negativeIndex = negativeIndex + 2;
            }
        }
        return ans;
    }
}
