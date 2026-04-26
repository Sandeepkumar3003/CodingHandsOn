package com.p6_Arrays_Medium;

import java.util.ArrayList;

public class A9_LeaderInAArray_Optimal {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> ans = leaderOptimal(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> leaderOptimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = n-1; i >=0; i--) {
            if(arr[i]>max){
                lst.add(arr[i]);
                max = arr[i];
            }
        }
        return lst;
    }
}
