package com.p6_Arrays_Easy;

public class A4_RemoveDeplicatesFromSortedArray_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,7,7,7,8};
        System.out.println("The array before removing duplicate elements is ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        int sortedSize = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < sortedSize ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];

            }
        }
        return i+1;
    }
}
