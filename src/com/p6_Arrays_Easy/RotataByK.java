package com.p6_Arrays_Easy;

import java.util.Arrays;

public class RotataByK {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k = nums.length - k;
        System.out.println(Arrays.toString(nums));
        RotateBy(nums,k);
        System.out.println(Arrays.toString(nums));
    }


    private static void RotateBy(int[] nums, int k) {

        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        rotate(nums,0,nums.length-1);

    }

    private static void rotate(int[] nums, int start, int end) {

        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }


    }
}
