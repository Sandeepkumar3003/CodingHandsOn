package com.p6_Arrays_Easy;

import java.util.HashMap;

public class A13_FindNumberThatAppearsOnceAndOthersTwice_Better_HashMap {
    public static void main(String[] args) {

        int[] arr ={1,1,2,2,3,4,4,5,5};
        int ans = appearsOnceBetter2(arr);
        System.out.println(ans);
    }

    private static int appearsOnceBetter2(int[] arr) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int num : arr){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }

        for(int i: arr){
            if(mpp.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}
