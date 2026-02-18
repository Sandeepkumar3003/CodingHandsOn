package com.p3_Basic_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        recursion(arr ,0,n-1);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

//        System.out.println(output);

    }

    private static void recursion(int[] arr, int start, int end) {


        int temp;
        if (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            recursion(arr,start+1,end-1);
        }



    }

}
