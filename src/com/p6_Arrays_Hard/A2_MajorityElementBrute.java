package com.p6_Arrays_Hard;

import java.util.ArrayList;

public class A2_MajorityElementBrute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(arr.length);

        ArrayList<Integer> ans = majorityElementBrute(arr);
        System.out.println(ans);

    }

    private static ArrayList<Integer> majorityElementBrute(int[] arr) {

        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){

                    count = count+1;
//                    System.out.println(arr[i]+"  "+arr[j]+"  "+count);
                }
            }
            if(count>2){
                lst.add(arr[i]);
            }
        }
        return lst;
    }
}
