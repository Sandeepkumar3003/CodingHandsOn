package com.p6_Arrays_Medium;

import java.util.Arrays;

public class A2_Sort012s_Better {
    public static void main(String[] args) {

        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};

        int[] ans = sortedSolution(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortedSolution(int[] arr) {

        int count1=0;
        int count2=0;
        int count3=0;
        for (int i: arr){
            if(arr[i]==0) count1++;
            if(arr[i]==1) count2++;
            if(arr[i]==2) count3++;
        }

        for(int i=0;i<count1;i++){
            arr[i]=0;
        }
        for(int i=count1;i<count1+count2;i++){
            arr[i]=1;
        }
        for(int i=count1+count2;i<arr.length;i++){
            arr[i]=2;
        }

        return arr;
    }

}
