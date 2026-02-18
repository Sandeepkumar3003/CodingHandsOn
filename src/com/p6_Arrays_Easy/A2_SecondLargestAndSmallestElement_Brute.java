package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A2_SecondLargestAndSmallestElement_Brute {

    public static void main(String[] args) {
        int[] arr1 = {5,4,2,9,9,4,5,6,3,8,11};
        int ans = secondLargestNumber(arr1);

        System.out.println(ans);

    }

    private static int secondLargestNumber(int[] arr1) {
        int[] arr = arr1.clone();
        Arrays.sort(arr);

        int n = arr.length;
        int largest = arr[n-1];
        int secondLargest = Integer.MAX_VALUE;
        for(int i= n-2; i>0;i--){
            if(arr[i]<largest){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }


}
