package com.p6_Arrays_Easy;

public class A8_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,47,6,77,111,25,44};
        int num = 25;
        int index = LinearSearch(arr,num);
        System.out.println(index);
    }

    private static int LinearSearch(int[] arr, int num) {
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
