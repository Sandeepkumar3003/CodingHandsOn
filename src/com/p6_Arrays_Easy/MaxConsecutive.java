package com.p6_Arrays_Easy;



public class MaxConsecutive {

    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1};
        int count = countNumber(arr);
    }

    private static int countNumber(int[] arr) {
        int count = 0;
        int maxi = 0;
        if(arr.length==0){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count = count+1;
                if(count>maxi){
                    maxi = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxi;
    }
}
