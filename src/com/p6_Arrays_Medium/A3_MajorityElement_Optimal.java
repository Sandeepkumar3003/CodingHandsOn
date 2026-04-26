package com.p6_Arrays_Medium;

public class A3_MajorityElement_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,2,2,4,2,2};

        int ans  = majorityNumberOptimal(arr);
        System.out.println(ans);
    }

    private static int majorityNumberOptimal(int[] arr) {
        int count = 0;
        int num =0;
        for (int i=0;i<arr.length;i++){
            if(count==0){
                num = arr[i];
                count++;
            } else if (arr[i]==num) {
                count++;
            }else {
                count--;
            }
        }
        int c =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                c++;
            }
        }
        if(c>arr.length/2){
            return num;
        }
        return -1;
    }
}
