package com.p7_BS_Easy;

public class A5_FlooringAndCeiling {
    public static void main(String[] args) {

//        Problem Statement:  given an sorted array arr of n integers and an integer x.
//        Find the floor and ceiling of x in arr[0..n-1].
//        The floor of x is the largest element in the array which is smaller than or equal to x.
//        The ceiling of x is the smallest element in the array greater than or equal to x
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 4;
        int[] res = getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + res[0] + " " + res[1]);
    }

    public static int[] getFloorAndCeil(int[] arr, int x) {
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[]{f, c};
    }

    private static int findCeil(int[] arr, int x) {
        int mid;
        int ans=-1;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans =mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;

    }

    private static int findFloor(int[] arr, int x) {
        int mid;
        int ans=-1;
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]<=x){
                ans =mid;

                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }
}
