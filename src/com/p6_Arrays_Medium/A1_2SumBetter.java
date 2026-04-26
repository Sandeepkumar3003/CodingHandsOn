package com.p6_Arrays_Medium;

import java.util.HashMap;

public class A1_2SumBetter {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        boolean ans = is2SumBetter(arr,target);
        System.out.println(ans);
    }

    private static boolean is2SumBetter(int[] arr, int target) {

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i <arr.length; i++) {

            if(mpp.containsKey(target-arr[i])){
                return true;
            }
            mpp.put(arr[i],i);
        }
        return false;
    }
}
