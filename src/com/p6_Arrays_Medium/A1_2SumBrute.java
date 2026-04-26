package com.p6_Arrays_Medium;

public class A1_2SumBrute {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        boolean ans = is2Sum(arr,target);
        System.out.println(ans);
    }

    private static boolean is2Sum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
//                if(i==j){
//                    continue;
//                }
                if(arr[i]+arr[j]==target){
//                    System.out.printf("%d  %d",arr[i],arr[j]);
                    return true;
                }
            }
        }
        return false;


    }
}
