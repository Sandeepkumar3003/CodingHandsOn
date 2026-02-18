package com.p6_Arrays_Easy;

import java.util.Arrays;
import java.util.HashSet;

public class A4_RemoveDeplicatesFromSortedArray_Brute {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,7,7,7,8};
        System.out.println("The array before removing duplicate elements is ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        removeDuplicates(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < newArray.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }

    private static void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length ; i++){
            set.add(arr[i]);
        }

        for(int x: set){
            System.out.print(x+ " ");
        }
    }
}


//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,1,2,3,4,4,5,6,7,7,7,8};
//
//        int[] newArr = removeDuplicates(arr);
//
//        System.out.println("After removing duplicates:");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }
//    }
//
//    private static int[] removeDuplicates(int[] arr) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//
//        int[] result = new int[set.size()];
//        int i = 0;
//        for (int x : set) {
//            result[i++] = x;
//        }
//        return result;
//    }
//}
