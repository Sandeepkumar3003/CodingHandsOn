package com.p6_Arrays_Hard;

import java.util.HashMap;

public class A5_LargestSubArrayWithSumZero {
    public static void main(String[] args) {
        int[] array = {6, -2, 2, -8, 1, 7, 4, -10};

        int length = subArraySum(array);
        System.out.println(length);
    }

    private static int subArraySum(int[] array) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int presum = 0;
        int maxi =0;
        mpp.put(0,-1);
        for (int i = 0; i < array.length; i++) {
            presum = presum + array[i];
            if(presum==0){
                maxi = i+1;
            }
            else{
                if(mpp.containsKey(presum)){
                    maxi = Math.max(maxi,i-mpp.get(presum));
                }
                else{
                    mpp.put(presum,i);
                }
            }
        }
        return maxi;
    }
}
