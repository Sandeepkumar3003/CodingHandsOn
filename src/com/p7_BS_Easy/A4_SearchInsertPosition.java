package com.p7_BS_Easy;

public class A4_SearchInsertPosition {
    public static void main(String[] args) {
        int[] a = {1,2,4,7}; // sorted array
        int target = 2; // target element to search

        int ind = binarySearchSolution(a, target);

        System.out.println(ind+ "    "+ a[ind]);

    }

    private static int binarySearchSolution(int[] a, int target) {
        int low = 0;
        int high = a.length-1;
        int mid;
        int index = -1;
        while (low<=high){
            mid = low+(high-low)/2;
            if(target<=a[mid]){
                index = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        return index;
    }
}
