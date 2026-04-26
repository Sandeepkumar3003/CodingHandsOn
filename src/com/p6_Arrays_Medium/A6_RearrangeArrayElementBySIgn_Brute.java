package com.p6_Arrays_Medium;

import java.util.Arrays;

public class A6_RearrangeArrayElementBySIgn_Brute {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,-2,4,-6};

        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rearrangeArray(int[] arr) {
        int[] arr1= new int[arr.length/2];
        int[] arr2 = new int[arr.length/2];
        int k=0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                arr1[k] = arr[i];
                k++;
            }else{
                arr2[j] = arr[i];
                j++;
            }
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr.length/2;i++){
            arr[2*i] = arr1[i];
            arr[2*i+1] = arr2[i];
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
