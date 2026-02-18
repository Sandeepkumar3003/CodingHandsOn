package com.p6_Arrays_Easy;

import java.util.Arrays;

public class A7_MoveZerostoEnd_Optimal {

    public static void main(String[] args) {

//        int[] arr = {1,2,0,3,1,0,2,0,4,0,5,8,0,7,0};
        int[] arr = {1};

        System.out.println(Arrays.toString(arr));

        int[] output = moveZeroesOptimal(arr);
        System.out.println(Arrays.toString(output));
    }

    private static int[] moveZeroesOptimal(int[] arr) {

        int j = -1;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }

        if (j == -1) return arr;

        int temp;
        for (int i=j+1; i<arr.length;i++){
            if(arr[i]!=0){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }


}
