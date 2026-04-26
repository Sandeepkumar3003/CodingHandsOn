package com.p6_Arrays_Medium;

import java.util.HashMap;

public class A14_CountSumArraysWithGIvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        int count = subArrays(arr,k);
        System.out.println(count);
    }

    private static int subArrays(int[] arr, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);

        int presum = 0;
        int count = 0;
        int reminder = 0;

        for (int i = 0; i < arr.length; i++) {
            presum = presum + arr[i];
            reminder = presum - k;

            if(mpp.containsKey(reminder)){
                count = count + mpp.get(reminder);
            }

            mpp.put(presum,mpp.getOrDefault(presum,0)+1);

        }

        return count;

    }
}
