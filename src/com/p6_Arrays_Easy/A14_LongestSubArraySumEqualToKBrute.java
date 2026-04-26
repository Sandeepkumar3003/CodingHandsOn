package com.p6_Arrays_Easy;

public class A14_LongestSubArraySumEqualToKBrute {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int ans = LongestSubArraySum(arr,k);
        System.out.println(ans);
    }

    private static int LongestSubArraySum(int[] arr, int k) {

        int maxLength=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int l = i; l <=j ; l++) {
                    sum = sum + arr[l];

//                    System.out.print(arr[l]+" ");

                }
                if(sum==k){
                    if(maxLength<j-i+1){
                        maxLength = j-i+1;
                    }

                }


            }
        }
        return maxLength;
    }
}
