package com.p6_Arrays_Hard;

import java.util.ArrayList;
import java.util.HashMap;

public class A2_MajorityElementBetter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(arr.length);

        ArrayList<Integer> ans = majorityElementBetter(arr);
        System.out.println(ans);

    }

    private static ArrayList<Integer> majorityElementBetter(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            if(mpp.get(arr[i])==2){
                lst.add(arr[i]);
            }
        }
        return lst;
    }
}
