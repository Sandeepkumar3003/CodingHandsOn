package com.p6_Arrays_Easy;

public class A3_CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
//        int[] arr1 = {5,4,2,9,9,4,5,6,3,8};
        int[] arr1 = {1,2,3,4,5,7,8,9};
        boolean ans = SortedOrNot(arr1);

        System.out.println(ans);

    }

    private static boolean SortedOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>=arr[i-1]){

            }
            else {
                return false;
            }

        }
        return true;
    }

}
