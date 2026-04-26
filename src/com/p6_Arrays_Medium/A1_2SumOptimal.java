package com.p6_Arrays_Medium;

import java.util.Arrays;
import java.util.Collection;

public class A1_2SumOptimal {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11,9,10};
        int target = 14;

        boolean ans = is2SumOptimal(arr,target);
        System.out.println(ans);
    }

    private static boolean is2SumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while (left<right){

            sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum>target){
                right--;
            }else{
                left++;
            }
        }return false;
    }

}
