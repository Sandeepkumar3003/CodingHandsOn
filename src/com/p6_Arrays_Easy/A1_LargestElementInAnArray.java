package com.p6_Arrays_Easy;

public class A1_LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr1 = {5,4,2,8,9,9,4,5,6,3};
        int ans = largest(arr1);
        System.out.println(ans);
    }

    private static int largest(int[] arr1) {
        int largest = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>largest){
                largest = arr1[i];
                System.out.println(largest+" "+i);
            }
        }
        return largest;
    }

}
