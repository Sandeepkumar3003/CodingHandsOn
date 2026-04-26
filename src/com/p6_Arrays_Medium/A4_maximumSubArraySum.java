package com.p6_Arrays_Medium;

public class A4_maximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Create an instance of Solution class


        int maxSum = maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);



    }

    private static int maxSubArray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start =0;
        int end = 0;
        int ansStart= 0;
        for (int i = 0; i < arr.length; i++) {

            if(sum==0){
                start =i;

            }

            sum = sum + arr[i];

            if(sum>max){
                max = sum;
                ansStart = start;
                end = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}

