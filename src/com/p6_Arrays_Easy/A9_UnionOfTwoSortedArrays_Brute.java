package com.p6_Arrays_Easy;

import java.util.ArrayList;

import java.util.HashSet;

public class A9_UnionOfTwoSortedArrays_Brute {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {12,3,4,4,5,6,7,7,8};

        ArrayList<Integer> ans = UnionOutput(arr1,arr2);
        System.out.println(ans);
    }

    private static ArrayList<Integer> UnionOutput(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> st = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }


        for(int i : st){
            arr.add(i);
        }
        return arr;
    }
}
