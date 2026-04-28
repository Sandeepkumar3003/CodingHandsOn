package com.p7_BS_Easy;

public class A2_LowerBound {
    public static void main(String[] args) {
        int[] a = {1,2,2,3}; // sorted array
        int target = 2; // target element to search

        int ind = binarySearchSolution(a, target);

            System.out.println(ind+ "    "+ a[ind]);

    }

    private static int binarySearchSolution(int[] a, int target) {
        int left = 0;
        int right = a.length-1;
        int mid;
        int index = -1;
        while (left<=right){
            mid = left+(right-left)/2;
            if(target<=a[mid]){
                index = mid;
                right = mid-1;

            }else{
                left = mid+1;
            }
        }
        return index;
    }
}
