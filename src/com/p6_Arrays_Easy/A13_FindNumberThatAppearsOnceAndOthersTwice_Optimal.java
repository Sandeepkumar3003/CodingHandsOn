package com.p6_Arrays_Easy;

public class A13_FindNumberThatAppearsOnceAndOthersTwice_Optimal {
    public static void main(String[] args) {

        int[] arr ={1,1,2,2,3,4,4,5,5};
        int ans = appearsOnceOptimal(arr);
        System.out.println(ans);
    }

    private static int appearsOnceOptimal(int[] arr) {
        int ans=0;
        for(int num: arr){
            ans = ans^num;
        }

        return ans;
    }
}
