package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A7_MoveZerostoEnd_Brute {
    public static void main(String[] args){

        int[] arr = {1,2,0,3,1,0,2,0,4,0,5,8,0,7,0};
        System.out.println(Arrays.toString(arr));

        int[] output = moveZeroes(arr);
        System.out.println(Arrays.toString(output));

    }

    private static int[] moveZeroes(int[] arr) {
        int[] temp = new int[arr.length];

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[count] = arr[i];
                count = count + 1;

            }

        }

        for (int j=0;j<temp.length;j++){
            arr[j] = temp[j];
        }

        for(int k=temp.length;k<arr.length;k++){
            arr[k] = 0;
        }
        return arr;

    }

}
