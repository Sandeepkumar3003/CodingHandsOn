package com.p6_Arrays_Medium;

import java.util.HashMap;
import java.util.Map;

public class A3_MajorityElement_Better {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,2,2,4,2,2};

        int ans  = majorityNumberBetter(arr);
        System.out.println(ans);
    }

    private static int majorityNumberBetter(int[] arr) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: mpp.entrySet()){
            if((int)entry.getValue()>(arr.length/2)){
                return (int)entry.getKey();
            }
        }
        return -1;
    }
}
