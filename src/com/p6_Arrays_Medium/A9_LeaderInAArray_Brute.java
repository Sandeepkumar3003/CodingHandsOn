package com.p6_Arrays_Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class A9_LeaderInAArray_Brute {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> ans = leader(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]<arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                lst.add(arr[i]);
            }

        }
        return lst;
    }
}
