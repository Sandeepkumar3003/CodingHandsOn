package com.p6_Arrays_Easy;

public class A12_MaximumConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {1,1,0,2,1,1,1,1,1,0,1,0,1,1,1};

        int ans = maximumOnes(arr);
        System.out.println(ans);
    }

    private static int maximumOnes(int[] arr) {
        int count=0;
        int max = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count = 0;
            }
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}
