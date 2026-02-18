package com.p6_Arrays_Easy;


import java.util.Arrays;

public class A2_SecondLargestAndSmallestElement_Better {

    public static void main(String[] args) {
        int[] arr1 = {5,4,2,9,9,4,5,6,3,8,11,13};
        int ans = secondLargest(arr1);

        System.out.println(ans);

    }

    private static int secondLargest(int[] arr1) {

        int largest = Integer.MIN_VALUE;

        int secondLargestNumber = Integer.MIN_VALUE;
        int n = arr1.length;
        for(int i=0;i<n;i++){
            if(arr1[i]>largest){
                largest = arr1[i];
            }
        }

        for (int i=0;i<n;i++){
            if(arr1[i]<largest && arr1[i]>secondLargestNumber){
                secondLargestNumber = arr1[i];
            }
        }

        return secondLargestNumber;
    }

}
