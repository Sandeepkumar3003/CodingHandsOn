package com.p6_Arrays_Easy;

public class A14_LongestSubArraySumEqualToK_Brute_ {
        public static void main(String[] args) {
//            int[] arr = {10, 5, 2, 7, 1, 9};
            int[] arr = {1,2,3,4};
//            int k = 15;
            int k = 6;

            int ans = LongestSubArraySum2(arr,k);
            System.out.println(ans);
        }

        private static int LongestSubArraySum2(int[] arr, int k) {

            int maxLength=0;
            for (int i = 0; i <arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum = sum + arr[j];
                    if(sum==k){
                        if(maxLength<j-i+1){
                             maxLength =j-i+1 ;
                        }
                    }
                    else if(sum>k){
                        break;
                    }
                }
            }
            return maxLength;

        }


}
