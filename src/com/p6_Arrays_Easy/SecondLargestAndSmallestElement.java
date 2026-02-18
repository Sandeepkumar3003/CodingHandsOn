package com.p6_Arrays_Easy;

public class SecondLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr1 = {5,4,2,9,9,4,5,6,3,8};
        int ans = secondLargest(arr1);

        System.out.println(ans);

        int smallest = secondSmallest(arr1);
        System.out.println(smallest);
    }

    private static int secondSmallest(int[] arr) {
        int smallest = arr[0];
//        Just taking -1 as largest
        int sSmallest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
//            in case if second largest we found at the end ,
            if(arr[i]!=smallest && sSmallest>arr[i]){
                sSmallest = arr[i];
            }
        }
        return sSmallest;

    }




    private static int secondLargest(int[] arr) {
        int largest = arr[0];
//        Just taking -1 as largest
        int sLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            }
//            in case if second largest we found at the end ,
            if(arr[i]!=largest && sLargest<arr[i]){
                sLargest = arr[i];
            }
        }
        return sLargest;

    }



}
