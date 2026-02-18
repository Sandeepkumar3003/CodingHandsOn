package com.p6_Arrays_Easy;


import java.util.Arrays;

public class A1_LargestElementInAnArray_Brute {

    public static void main(String[] args) {
        int[] arr1 = {5,4,2,8,9,9,4,5,6,3};
        int ans = largestElement(arr1);
        System.out.println(ans);

        int ans2 = largestNumber(arr1);
        System.out.println(ans2);
    }

    private static int largestElement(int[] arr1) {
        Arrays.sort(arr1);
        return arr1[arr1.length-1];
    }

    private static int largestNumber(int[] arr1){
        int temp = arr1[0];
        for (int i=1;i<arr1.length;i++){
            System.out.println(arr1[i]+" "+i);
            if(arr1[i]>temp){
                temp = arr1[i];

            }
        }
        return temp;
    }
}
