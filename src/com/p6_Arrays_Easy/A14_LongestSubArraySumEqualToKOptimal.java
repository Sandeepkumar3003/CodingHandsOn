package com.p6_Arrays_Easy;

public class A14_LongestSubArraySumEqualToKOptimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,0,0,0,1,1,3,3};
//        int[] arr = {1,2,3};
//        int[] arr = {1,2,3,1,1,1,1,3,3};

        int k=3;

        int ans = maxLengthOptimal(arr,k);
        System.out.println(ans);
    }

    private static int maxLengthOptimal(int[] arr, int k) {
        int maxLen =0;
        int sum=0;
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            while(sum>k) {
                sum = sum - arr[i];
                i++;
            }

            if(sum==k){
                maxLen = Math.max(maxLen,j-i+1);
            }
        }

        return maxLen;
    }
}
