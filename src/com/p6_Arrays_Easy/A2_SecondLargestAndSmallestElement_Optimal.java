package com.p6_Arrays_Easy;

public class A2_SecondLargestAndSmallestElement_Optimal {

    public static void main(String[] args) {
        int[] arr1 = {5,4,2,9,9,4,5,6,3,8,11,13};
        int ans = secondLargest(arr1);

        System.out.println(ans);

    }

    private static int secondLargest(int[] arr1) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int n = arr1.length;
        for (int i=0;i<n;i++){
            if(arr1[i]>largest){
                secondLargest = largest;
                largest = arr1[i];
            } else if (arr1[i]>secondLargest && arr1[i]<largest) {
                secondLargest = arr1[i];
            }
        }
        return secondLargest;
    }
}
