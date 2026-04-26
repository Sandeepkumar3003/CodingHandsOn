package com.p6_Arrays_Easy;

import java.util.HashMap;

public class A14_LongestSubArraySumEqualToKBetter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,0,0,0,1,1,3,3};
//        int[] arr = {1,2,3};
        int k=3;

        int ans = maxLength(arr,k);
        System.out.println(ans);
    }

    private static int maxLength(int[] arr, int k) {
        int maxlen=0;
        int preSum=0;
        int len=0;
        int reminder=0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,-1);
        for (int i = 0; i <arr.length; i++) {
            preSum = preSum + arr[i];

            if(preSum==k){
                maxlen=i+1;
            }else{
                reminder = preSum - k;
                if(mpp.containsKey(reminder)){
                    len = i - mpp.get(reminder);
//                    System.out.println(i+" "+mpp.get(reminder)+ " "+ maxlen);
                    if(len>maxlen){
                        maxlen = len;
                    }
                }
            }

            if(!mpp.containsKey(preSum)){
                mpp.put(preSum,i);
            }
        }

        return maxlen;
    }
}
